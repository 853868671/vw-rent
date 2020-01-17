package com.vw.rent.service.impl;

import com.vw.rent.entity.Order;
import com.vw.rent.mapper.OrderMapper;
import com.vw.rent.service.IOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wwd
 * @since 2019-12-30
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
