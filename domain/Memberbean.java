package domain;

import java.text.Format;
import service.*;

public class Memberbean {
	private String id,name,ssn,pass;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public String getPass() {
		return pass;
	}
	
	@Override
		public String toString() {
			return String.format("아이디:%s\n"
				+ "이름:%s\n"
				+ "주민번호%s\n"
				+ "비밀번호%s\n"
				,id,name,ssn,pass);
		}
}
