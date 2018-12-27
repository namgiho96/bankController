package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.AccountBean;
import domain.AdminBean;

public class AdminserviceImpl implements AdminService {
	private HashMap<String, AdminBean> map;
	private int seq;

	public AdminserviceImpl() {
		map = new HashMap<>();
		seq = 0;
	}

	@Override
	public void caeatAdmin(String adminNum, String name, String pass, String auth) {
		AdminBean bean = new AdminBean();
		bean.setAdminNum(String.valueOf(seq));

		seq++;
	}

	@Override
	public ArrayList<AdminBean> list() {
		return (ArrayList<AdminBean>) map.values();
	}

	@Override
	public ArrayList<AdminBean> findByAuth(String auth) {
		ArrayList<AdminBean> list = new ArrayList<>();
		for (int i = 0; i < map.size(); i++) {
			// º¸·ù
		}
		return null;
	}

	@Override
	public AdminBean findById(String adminNum) {

		return map.get(adminNum);
	}

	@Override
	public int countAdmin() {
		return map.size();
	}

	@Override
	public boolean existAdmin(String adminNum, String pass) {
		boolean exist = false;
		if (map.containsKey(adminNum) && map.get(adminNum).getPass().equals(pass)) {
			exist = true;
		}
		return exist;
	}

	@Override
	public void updatePass(String adminNum, String pass, String newPass) {
		if (map.get(adminNum).getPass().equals(pass)) {
			map.get(adminNum).setPass(newPass);
		}
	}

	@Override
	public void updateAuth(String adminNum, String auth) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAdmin(String adminNum) {
		map.remove(adminNum);
	}

}
