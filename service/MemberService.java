package service;

import domain.Memberbean;

/**
 * @author namgiho
 * @date 2018. 12. 26.
 * @desc 맴버기능구현
 */
public interface MemberService {

	public void join(String id,String name,String ssn,String pw);
	
	public Memberbean[] findAll();
	
	public Memberbean[] findbysome(String name);
	
	public Memberbean findbyId(String id);
	
	public int count();
	
	public boolean exsitMember(String id, String pass);
	
	public void updatePass(String id,String pass,String newpw);
	
	public void deleteMember(String id,String pass);
	
	
	
}
