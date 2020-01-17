package com.vw.rent.service.impl;

import com.vw.rent.entity.Dictionary;
import com.vw.rent.mapper.DictionaryMapper;
import com.vw.rent.service.DictionaryService;
import com.vw.rent.vo.DictionaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> getStatus(Integer type) {
        return dictionaryMapper.selectByTypeId(type);
    }

    @Override
    public List<DictionaryVo> getNewStatus() {
        return dictionaryMapper.getNewStatus();
    }

    @Override
    public List<DictionaryVo> getFawStatus() {
        return dictionaryMapper.getFawStatus();
    }
}
