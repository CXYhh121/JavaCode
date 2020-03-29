package com.dao;

import com.pojo.Kc;
import com.pojo.KcExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface KcMapper {
    int countByExample(KcExample example);

    int deleteByExample(KcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kc record);

    int insertSelective(Kc record);

    List<Kc> selectByExampleWithBLOBs(KcExample example);

    List<Kc> selectByExample(KcExample example);

    Kc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kc record, @Param("example") KcExample example);

    int updateByExampleWithBLOBs(@Param("record") Kc record, @Param("example") KcExample example);

    int updateByExample(@Param("record") Kc record, @Param("example") KcExample example);

    int updateByPrimaryKeySelective(Kc record);

    int updateByPrimaryKeyWithBLOBs(Kc record);

    int updateByPrimaryKey(Kc record);
}