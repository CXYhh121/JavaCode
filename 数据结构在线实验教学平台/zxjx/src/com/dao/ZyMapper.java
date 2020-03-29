package com.dao;

import com.pojo.Zy;
import com.pojo.ZyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ZyMapper {
    int countByExample(ZyExample example);

    int deleteByExample(ZyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zy record);

    int insertSelective(Zy record);

    List<Zy> selectByExampleWithBLOBs(ZyExample example);

    List<Zy> selectByExample(ZyExample example);

    Zy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zy record, @Param("example") ZyExample example);

    int updateByExampleWithBLOBs(@Param("record") Zy record, @Param("example") ZyExample example);

    int updateByExample(@Param("record") Zy record, @Param("example") ZyExample example);

    int updateByPrimaryKeySelective(Zy record);

    int updateByPrimaryKeyWithBLOBs(Zy record);

    int updateByPrimaryKey(Zy record);
}