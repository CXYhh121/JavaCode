package com.service.impl;

import com.dao.ZyMapper;
import com.pojo.Zy;
import com.pojo.ZyExample;
import com.service.ZyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZyServiceImpl implements ZyService {
    @Autowired
    private ZyMapper zyMapper;
    @Override
    public int countByExample(ZyExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ZyExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return zyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Zy record) {
        return 0;
    }

    @Override
    public int insertSelective(Zy record) {
        return zyMapper.insertSelective(record);
    }

    @Override
    public List<Zy> selectByExampleWithBLOBs(ZyExample example) {
        return null;
    }

    @Override
    public List<Zy> selectByExample(ZyExample example) {
        return null;
    }

    @Override
    public Zy selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Zy record, ZyExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(Zy record, ZyExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Zy record, ZyExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Zy record) {
        return zyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Zy record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Zy record) {
        return 0;
    }
}
