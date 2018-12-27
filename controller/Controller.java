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
			switch(JOptionPane.showInputDialog("[0.����]\n"
					+ "1.ȸ������\n"
					+ "2.ȸ������\n"
					+ "3.�˻�\n"
					+ "4.���̵� �˻�\n"
					+ "5.ȸ����\n"
					+ "6.�α���\n"
					+ "7.ȸ������\n"
					+ "8.ȸ��Ż��\n"
					+ "9.���»���"
					+ "10.���� ����Ʈ")) {
			case "0":
				JOptionPane.showMessageDialog(null, "�����մϴ�");
				return;
			case "1":
				memberService.join(JOptionPane.showInputDialog("���̵�:"),
								   JOptionPane.showInputDialog("�̸�:"),
								   JOptionPane.showInputDialog("�ֹι�ȣ:"),
								   JOptionPane.showInputDialog("��й�ȣ:"));
					break;
			case "2":
				JOptionPane.showMessageDialog(null,memberService.findAll());
				break;
			case "3":
				
				break;
			case "4":
				JOptionPane.showMessageDialog(null,memberService.findbyId(JOptionPane.showInputDialog("ã���� ���̵� �Է��ϼ���")));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,memberService.count());
				break;
			case "6":
				
				break;
			case "7":
				memberService.updatePass(JOptionPane.showInputDialog("���̵�:"),
						JOptionPane.showInputDialog("�н�����:"),
						JOptionPane.showInputDialog("���ο���"));	
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
