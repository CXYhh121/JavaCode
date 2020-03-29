package com.service.impl;

import com.dao.ZlMapper;
import com.pojo.Zl;
import com.pojo.ZlExample;
import com.service.ZlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZlServiceImpl implements ZlService {

    @Autowired
    private ZlMapper zlMapper;
    @Override
    public int countByExample(ZlExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ZlExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return zlMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Zl record) {
        return 0;
    }

    @Override
    public int insertSelective(Zl record) {
        return zlMapper.insertSelective(record);
    }

    @Override
    public List<Zl> selectByExampleWithBLOBs(ZlExample example) {
        return null;
    }

    @Override
    public List<Zl> selectByExample(ZlExample example) {
        return null;
    }

    @Override
    public Zl selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Zl record, ZlExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(Zl record, ZlExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Zl record, ZlExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Zl record) {
        return zlMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Zl record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Zl record) {
        return 0;
    }
}
