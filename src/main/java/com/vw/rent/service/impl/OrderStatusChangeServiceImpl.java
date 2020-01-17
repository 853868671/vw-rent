package com.vw.rent.service.impl;

import com.vw.rent.entity.OrderStatusChange;
import com.vw.rent.mapper.DictionaryMapper;
import com.vw.rent.mapper.OrderStatusChangeMapper;
import com.vw.rent.service.OrderStatusChangeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderStatusChangeServiceImpl implements OrderStatusChangeService {

    @Autowired
    private OrderStatusChangeMapper orderStatusChangeMapper;
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<OrderStatusChange> getRentStatus(Integer rent, Long orderNo) {

        return orderStatusChangeMapper.getRentStatus(orderNo);


    }
}
