package service;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import domain.AccountBean;
import java.text.SimpleDateFormat;

/**
 * @author Namgiho
 * @date 2018. 12. 26.
 * @desc ÀºÇà°èÁÂ ±¸Çö°´Ã¼
 */
public class AccountBeanServiceImpl implements AccountBeanService {
	private ArrayList<AccountBean> list;
	
	public AccountBeanServiceImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public void createAccount(int money) {
		AccountBean bean = new AccountBean();
		bean.setAccountNum(createAccountNum());
		bean.setMomey(money);
		bean.setToday(findDate());
		list.add(bean);
		
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String account = "";
		int[] a = new int[10]; 
		
			for(int i=0;i<10;i++) {
				if(i==3) {
					a[i] += random.nextInt(9);
					account += a[i]+"-";
				}else {
					a[i] += random.nextInt(9);
					account += a[i]+"";
				}
			}
				return account;
	}
	
	@Override
	public String findDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(list);
		
	}
	@Override
	public ArrayList<AccountBean> findall() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public AccountBean findbyaccountNum(String accountNum) {
		AccountBean bean = new AccountBean();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				
				bean = list.get(i);
			}
		}
		return bean;
		
	}
	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean ok = false;
		for(int i=0;i<list.size();i++) {
			if(createAccountNum().equals(accountNum)) {
				ok = true;
			}
		}
			return ok;
	}



	@Override
	public void depositMoney(String accountNum,int money) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i).setMomey(list.get(i).getMomey()+money);
				
				break;
				
			}
			
		}
	}

	@Override
	public void withdrawMoney(String accountNum ,int money) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i).setMomey(list.get(i).getMomey()-money);
				
				break;
			}
		}
	}
	@Override
	public void deleteAccountNum(String accountNum) {
		for(int i=0;i<list.size();i++) {
			if() {
				
			}
			
		}
		
	}
	
	
}
