package com.service.impl;

import com.dao.LyMapper;
import com.pojo.Ly;
import com.pojo.LyExample;
import com.service.LyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LyServiceImpl implements LyService {
    @Autowired
    private LyMapper lyMapper;
    @Override
    public int countByExample(LyExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(LyExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Ly record) {
        return 0;
    }

    @Override
    public int insertSelective(Ly record) {
        return lyMapper.insertSelective(record);
    }

    @Override
    public List<Ly> selectByExample(LyExample example) {
        return null;
    }

    @Override
    public Ly selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Ly record, LyExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Ly record, LyExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Ly record) {
        return lyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Ly record) {
        return 0;
    }
}
