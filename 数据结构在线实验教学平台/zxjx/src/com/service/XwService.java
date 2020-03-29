package com.service;

import com.pojo.Xw;
import com.pojo.XwExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface XwService {
    int countByExample(XwExample example);

    int deleteByExample(XwExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xw record);

    int insertSelective(Xw record);

    List<Xw> selectByExampleWithBLOBs(XwExample example);

    List<Xw> selectByExample(XwExample example);

    Xw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xw record, @Param("example") XwExample example);

    int updateByExampleWithBLOBs(@Param("record") Xw record, @Param("example") XwExample example);

    int updateByExample(@Param("record") Xw record, @Param("example") XwExample example);

    int updateByPrimaryKeySelective(Xw record);

    int updateByPrimaryKeyWithBLOBs(Xw record);

    int updateByPrimaryKey(Xw record);
}
