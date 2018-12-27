package controller;
import domain.*;
import service.*;
import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		 Memberbean member = null;
		 AccountBean account = null;
		 MemberService memberService = new MemberServiceImpl();
		 AccountBeanService accountBeanService = new AccountBeanServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[0.종료]\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.검색\n"
					+ "4.아이디 검색\n"
					+ "5.회원수\n"
					+ "6.로그인\n"
					+ "7.회원수정\n"
					+ "8.회원탈퇴\n"
					+ "9.계좌생성"
					+ "10.계좌 리스트")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료합니다");
				return;
			case "1":
				memberService.join(JOptionPane.showInputDialog("아이디:"),
								   JOptionPane.showInputDialog("이름:"),
								   JOptionPane.showInputDialog("주민번호:"),
								   JOptionPane.showInputDialog("비밀번호:"));
					break;
			case "2":
				JOptionPane.showMessageDialog(null,memberService.findAll());
				break;
			case "3":
				
				break;
			case "4":
				JOptionPane.showMessageDialog(null,memberService.findbyId(JOptionPane.showInputDialog("찾으실 아이디를 입력하세요")));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,memberService.count());
				break;
			case "6":
				
				break;
			case "7":
				memberService.updatePass(JOptionPane.showInputDialog("아이디:"),
						JOptionPane.showInputDialog("패스워드:"),
						JOptionPane.showInputDialog("새로운비번"));	
				break;
			case "8":
				break;
			case "9":
				JOptionPane.showMessageDialog(null,accountBeanService.createAccountNum());
				break;
			case "10":
				
				break;
			}
		}
	}
}
