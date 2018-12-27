package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	public void join(String title,String content,String writer);
						//���� 		//�Խñ� 			//�۰� 		//�Խ��� �ð�   //�Խ��� ������
	public ArrayList<ArticleBean> list();
	
	public ArrayList<ArticleBean> findBywriter(String writer);
	
	public ArticleBean findByTitle(String title);
	
	public int countSeq();
	
	public void updateTitle(String title, String content);
	
	public void delete(String title);
	
	
}
