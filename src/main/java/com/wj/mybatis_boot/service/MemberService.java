package com.wj.mybatis_boot.service;

import com.wj.mybatis_boot.model.dto.Member;

import java.util.List;

public interface MemberService {
	int joinMember(Member member);
	Member searchMember(String id);
	List<Member> getMemberList();
	int deleteMember(String id);
}
