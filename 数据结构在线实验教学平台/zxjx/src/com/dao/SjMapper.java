package com.dao;

import com.pojo.Sj;
import com.pojo.SjExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SjMapper {
    int countByExample(SjExample example);

    int deleteByExample(SjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sj record);

    int insertSelective(Sj record);

    List<Sj> selectByExample(SjExample example);

    Sj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sj record, @Param("example") SjExample example);

    int updateByExample(@Param("record") Sj record, @Param("example") SjExample example);

    int updateByPrimaryKeySelective(Sj record);

    int updateByPrimaryKey(Sj record);
}