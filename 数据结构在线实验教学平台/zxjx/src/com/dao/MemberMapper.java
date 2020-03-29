package com.dao;
/**
 * 注册用户数据操作
 */
import com.pojo.Member;
import com.pojo.MemberExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    String getSame(String username);

    int updateIfuse(Member record);

    int updateHy(Member record);

    List<Member> toLogin(Member record);

    List<Member> toLost(Member record);

    int upMember(Member record);

    List<Member> memberPwd(Member record);

    int memberupPwd(Member record);

    String selectName(String username);
}