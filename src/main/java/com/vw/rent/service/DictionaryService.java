package com.vw.rent.service;

import com.vw.rent.entity.Dictionary;
import com.vw.rent.vo.DictionaryVo;

import java.util.List;

public interface DictionaryService {

    List<Dictionary> getStatus(Integer type);

    List<DictionaryVo> getNewStatus();

    List<DictionaryVo> getFawStatus();
}
