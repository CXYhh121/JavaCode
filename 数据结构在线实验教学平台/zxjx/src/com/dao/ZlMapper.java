package com.dao;

import com.pojo.Zl;
import com.pojo.ZlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ZlMapper {
    int countByExample(ZlExample example);

    int deleteByExample(ZlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zl record);

    int insertSelective(Zl record);

    List<Zl> selectByExampleWithBLOBs(ZlExample example);

    List<Zl> selectByExample(ZlExample example);

    Zl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByExampleWithBLOBs(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByExample(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByPrimaryKeySelective(Zl record);

    int updateByPrimaryKeyWithBLOBs(Zl record);

    int updateByPrimaryKey(Zl record);
}