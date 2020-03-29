package com.service.impl;

import com.dao.XwMapper;
import com.pojo.Xw;
import com.pojo.XwExample;
import com.service.XwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("xwServiceImpl")
public class XwServiceImpl implements XwService {
    @Autowired
    private XwMapper xwMapper;
    @Override
    public int countByExample(XwExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(XwExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return xwMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Xw record) {
        return xwMapper.insert(record);
    }

    @Override
    public int insertSelective(Xw record) {
        return xwMapper.insertSelective(record);
    }

    @Override
    public List<Xw> selectByExampleWithBLOBs(XwExample example) {
        return null;
    }

    @Override
    public List<Xw> selectByExample(XwExample example) {
        return null;
    }

    @Override
    public Xw selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Xw record, XwExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(Xw record, XwExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Xw record, XwExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Xw record) {
        return xwMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Xw record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Xw record) {
        return xwMapper.updateByPrimaryKey(record);
    }
}
