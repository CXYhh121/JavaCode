package com.service.impl;

import com.dao.MemberMapper;
import com.pojo.Member;
import com.pojo.MemberExample;
import com.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public int countByExample(MemberExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(MemberExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return memberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Member record) {
        return memberMapper.insert(record);
    }

    @Override
    public int insertSelective(Member record) {
        return 0;
    }

    @Override
    public List<Member> selectByExample(MemberExample example) {
        return null;
    }

    @Override
    public Member selectByPrimaryKey(Integer id) {

        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Member record, MemberExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Member record, MemberExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Member record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Member record) {
        return memberMapper.updateByPrimaryKey(record);
    }

    @Override
    public String getSame(String username) {
        return memberMapper.getSame(username);
    }

    @Override
    public int updateIfuse(Member record) {
        return memberMapper.updateIfuse(record);
    }

    @Override
    public int updateHy(Member record) {
        return memberMapper.updateHy(record);
    }

    @Override
    public List<Member> toLogin(Member record) {
        return memberMapper.toLogin(record);
    }

    @Override
    public List<Member> toLost(Member record) {
        return memberMapper.toLost(record);
    }

    @Override
    public int upMember(Member record) {
        return memberMapper.upMember(record);
    }

    @Override
    public List<Member> memberPwd(Member record) {
        return memberMapper.memberPwd(record);
    }

    @Override
    public int memberupPwd(Member record) {
        return memberMapper.memberupPwd(record);
    }

    @Override
    public String selectName(String username) {
        return memberMapper.selectName(username);
    }
}
