package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {

	public void createAccount(int money);

	public String createAccountNum(); // ���¹�ȣ ����

	public String findDate();

	public ArrayList<AccountBean> findall();

	public AccountBean findbyaccountNum(String accountNum);

	public int countAccount();

	public boolean existAccountNum(String accountNum);

	public void depositMoney(String accountNum, int money);

	public void withdrawMoney(String accountNum, int money);

	public void deleteAccountNum(String accountNum);
}
