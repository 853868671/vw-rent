package com.vw.rent.service;

import com.vw.rent.entity.OrderStatusChange;

import java.util.List;

public interface OrderStatusChangeService {

    List<OrderStatusChange> getRentStatus(Integer rent, Long orderNo);
}
