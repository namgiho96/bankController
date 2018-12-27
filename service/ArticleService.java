package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	public void join(String title,String content,String writer);
						//제목 		//게시글 			//작가 		//게시판 시간   //게시판 페이지
	public ArrayList<ArticleBean> list();
	
	public ArrayList<ArticleBean> findBywriter(String writer);
	
	public ArticleBean findByTitle(String title);
	
	public int countSeq();
	
	public void updateTitle(String title, String content);
	
	public void delete(String title);
	
	
}
