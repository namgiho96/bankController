package service;

import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService{
	private HashMap<String, ArticleBean> map;
	private int seq;
	
	 public ArticleServiceImpl() {
		map = new HashMap<>();
		seq = 1000;
	}
	
	@Override
	public void join(String title, String content, String writer) {
		ArticleBean bean = new ArticleBean();
		bean.setContent(content);
		bean.setTitle(String.valueOf(seq));
		bean.setTitle(title);
		bean.setWriter(writer);
		map.put(bean.getTitle(),bean);
		seq++;
		
	}

	@Override
	public ArrayList<ArticleBean> list() {
		return (ArrayList<ArticleBean>) map.values();
	}

	@Override
	public ArrayList<ArticleBean> findBywriter(String writer) {
		ArrayList<ArticleBean> list = new ArrayList<>();
		Set<String> set = map.keySet();
		// for each loop 이라고 합니다
		// Set 은 인덱스가 없어요...
		// 그래서 int i = 0 이런식으로 못돌립니다.
		// 그래서 아래처럼 for 를 돌립니다.
		for(String key: set) {
			if(writer.equals(map.get(key).getWriter())) {
				list.add(map.get(key));
			}
		}
		return list;
	}

	@Override
	public ArticleBean findByTitle(String title) {
		
		return map.get(title);
	}

	@Override
	public int countSeq() {
		return map.size();
	}

	@Override
	public void updateTitle(String title, String content) {
		map.get(title).setContent(content);
	}

	@Override
	public void delete(String title) {
		map.remove(title);
	}

}
