package com.service.impl;

import com.dao.SjMapper;
import com.pojo.Sj;
import com.pojo.SjExample;
import com.service.SjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SjServiceImpl implements SjService {
    @Autowired
    private SjMapper sjMapper;
    @Override
    public int countByExample(SjExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SjExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sjMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Sj record) {
        return 0;
    }

    @Override
    public int insertSelective(Sj record) {
        return sjMapper.insertSelective(record);
    }

    @Override
    public List<Sj> selectByExample(SjExample example) {
        return null;
    }

    @Override
    public Sj selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Sj record, SjExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Sj record, SjExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Sj record) {
        return sjMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sj record) {
        return 0;
    }
}
