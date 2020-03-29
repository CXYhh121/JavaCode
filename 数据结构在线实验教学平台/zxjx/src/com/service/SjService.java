package com.service;

import com.pojo.Sj;
import com.pojo.SjExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SjService {
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
