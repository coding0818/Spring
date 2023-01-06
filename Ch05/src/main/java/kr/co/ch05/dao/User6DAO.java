package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User6VO;

@Repository
public class User6DAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser6(User6VO vo) {
		mybatis.insert("insertUser6", vo);
	}
	public User6VO selectUser6(String uid) {
		return mybatis.selectOne("selectUser6", uid);
	}
	public List<User6VO> selectUser6s() {
		return mybatis.selectList("selectUser6s");
	}
	public void updateUser6(User6VO vo) {
		mybatis.update("updateUser6", vo);
	}
	public void deleteUser6(String uid) {
		mybatis.delete("deleteUser6", uid);
	}
}
