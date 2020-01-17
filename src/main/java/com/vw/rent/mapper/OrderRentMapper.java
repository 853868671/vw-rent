package com.vw.rent.mapper;

import com.vw.rent.entity.OrderRent;
import java.util.List;

public interface OrderRentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    int deleteByPrimaryKey(Integer orderRentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    int insert(OrderRent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    OrderRent selectByPrimaryKey(Integer orderRentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    List<OrderRent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    int updateByPrimaryKey(OrderRent record);
}