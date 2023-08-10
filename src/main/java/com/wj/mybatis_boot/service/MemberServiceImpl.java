package com.wj.mybatis_boot.service;

import com.wj.mybatis_boot.model.dao.MemberDao;
import com.wj.mybatis_boot.model.dto.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberdao;

	// 마이바티스에 연결하기 위해서 sqlSession 객체를 생성해야 된다.
	// root-context.xml 에서 정의한 bean
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int joinMember(Member member) {
		return 0;
	}

	@Override
	public Member searchMember(String id) {
		return null;
	}

	@Override
	public List<Member> getMemberList() {
		return null;
	}

	@Override
	public int deleteMember(String id) {
		return 0;
	}
}
