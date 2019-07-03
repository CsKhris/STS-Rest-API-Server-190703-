package kr.co.item.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.item.domain.Item;

@Repository
public class ItemDao {
	@Autowired
	private SqlSession sqlSession;
	
	// 전체 Data를 가져오는 Method
	public List<Item> allitem(){
		return sqlSession.selectList("item.allitem");
	}
	
	// itemid를 가지고 하나의 Data만 찾아오는 Method
	public Item getitem(int itemid) {
		return sqlSession.selectOne("item.getitem", itemid);
	}
	
}
