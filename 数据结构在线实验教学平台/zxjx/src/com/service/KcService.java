package com.service;

import com.pojo.Kc;
import com.pojo.KcExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KcService {
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
