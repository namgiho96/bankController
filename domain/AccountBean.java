package domain;
import service.*;
public class AccountBean {
	private String accountNum,today;
	private int momey;
	 
	 public void setAccountNum(String accountNum) {
		 this.accountNum =  accountNum;
	 }
	 public void setToday(String today) {
		 this.today =  today;
	 }
	 public void setMomey(int momey) {
		 this.momey =  momey;
	 }
	 public String getAccountNum(){
		 return accountNum;
	 }
	 public String getToday(){
		 return today;
	 }
	 public int getMomey(){
		 return momey;
	 }
	 @Override
	public String toString() {
		return String.format(""
				+ ""
				+ "",accountNum,today,momey);
	}
	 
}
