package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User5VO;

@Repository
public class User5DAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser5(User5VO vo) {
		mybatis.insert("insertUser5", vo);
	}
	public User5VO selectUser5(String uid) {
		return mybatis.selectOne("selectUser5", uid);
	}
	public List<User5VO> selectUser5s() {
		return mybatis.selectList("selectUser5s");
	}
	public void updateUser5(User5VO vo) {
		mybatis.update("updateUser5");
	}
	public void deleteUser5(String uid) {
		mybatis.delete("deleteUser5", uid);
	}
	
}
