package com.service.impl;

import com.dao.KcMapper;
import com.pojo.Kc;
import com.pojo.KcExample;
import com.service.KcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KcServiceImpl implements KcService {
    @Autowired
    private KcMapper kcMapper;
    @Override
    public int countByExample(KcExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(KcExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return kcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Kc record) {
        return 0;
    }

    @Override
    public int insertSelective(Kc record) {
        return kcMapper.insertSelective(record);
    }

    @Override
    public List<Kc> selectByExampleWithBLOBs(KcExample example) {
        return null;
    }

    @Override
    public List<Kc> selectByExample(KcExample example) {
        return null;
    }

    @Override
    public Kc selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Kc record, KcExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(Kc record, KcExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Kc record, KcExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Kc record) {
        return kcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Kc record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Kc record) {
        return 0;
    }
}
