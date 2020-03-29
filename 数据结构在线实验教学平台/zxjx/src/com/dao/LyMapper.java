package com.dao;

import com.pojo.Ly;
import com.pojo.LyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LyMapper {
    int countByExample(LyExample example);

    int deleteByExample(LyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ly record);

    int insertSelective(Ly record);

    List<Ly> selectByExample(LyExample example);

    Ly selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ly record, @Param("example") LyExample example);

    int updateByExample(@Param("record") Ly record, @Param("example") LyExample example);

    int updateByPrimaryKeySelective(Ly record);

    int updateByPrimaryKey(Ly record);
}