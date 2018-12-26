package service;

import domain.AccountBean;

public interface AccountBeanService {

	public void open(String accountNum);
	
	public AccountBean[] listAccountNum();
	
	public AccountBean[] findbyname();
	
	public AccountBean oneAccountNum();
	
	public boolean existAccountNum();
	
	public void updateAccountNum();
	
	public void deleteAccountNum();
}
