package service;   
import domain.Memberbean;

public class MemberServiceImpl implements MemberService {
	private Memberbean[] members;
	private int count;
	
		public MemberServiceImpl() {
			members = new Memberbean[10];
			count = 0;
		}

	@Override
	public void join(String id, String name, String ssn, String pass) {
		Memberbean member = new Memberbean();
		member.setId(id);
		member.setPass(pass);
		member.setSsn(ssn);
		member.setPass(pass);
		members[count] = member; 
		count++;
	}
	
	@Override
	public Memberbean[] findAll() {
		return members;
	}
	
	@Override
	public Memberbean[] findbysome(String name) {
		int j = 0;
		for(int i = 0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				j++;
			}
		}
		Memberbean[] beans = new Memberbean[j];
		j = 0; // 만약 동명이인이 3명이라면
		// j = 0 으로 초기화 하지 않으면
		// 아래 부분에서 j 는 3부터 시작하기 때문
		for(int i = 0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				beans[j] = members[i];
				j++;
				if(j==beans.length) {
					break;
				}
			}
		}
		return null;
	}
	
	@Override
	public Memberbean findbyId(String id) {
		Memberbean member = new Memberbean();
		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
			}
		}
				return member;
	}
	@Override
		public int count() {
		return count;
	}
	@Override
	public boolean exsitMember(String id, String pass) {
		Memberbean member = new Memberbean();
		boolean ok = false;
		for(int i=0;i<count;i++){
			if(member.getId().equals(id)&&member.getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
	

	
	@Override
	public void updatePass(String id, String pass, String newpw) {
		for(int i=0;i<count;i++) {
			if(exsitMember(id,pass)) {
				members[i].setPass(newpw);
				break;
			}
		}
	}
	@Override
	public void deleteMember(String id, String pass) {
		for(int i=0;i<count;i++) {
			if(exsitMember(id,pass)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
			}
		}
	}

}
