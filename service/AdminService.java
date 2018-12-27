package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void caeatAdmin(String adminNum,String name, String pass, String auth);

	public ArrayList<AdminBean> list();

	public ArrayList<AdminBean> findByAuth(String auth);

	public AdminBean findById(String adminNum);

	public int countAdmin();

	public boolean existAdmin(String adminNum, String pass);

	public void updatePass(String adminNum, String pass, String newPass);

	public void updateAuth(String adminNum, String auth);

	public void deleteAdmin(String adminNum);

}
