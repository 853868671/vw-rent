package com.vw.rent.mapper;

import com.vw.rent.entity.OrderRentNew;
import java.util.List;

public interface OrderRentNewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent_new
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    int deleteByPrimaryKey(Integer newId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent_new
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    int insert(OrderRentNew record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent_new
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    OrderRentNew selectByPrimaryKey(Integer newId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent_new
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    List<OrderRentNew> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vw_order_rent_new
     *
     * @mbg.generated Fri Dec 27 10:19:20 CST 2019
     */
    int updateByPrimaryKey(OrderRentNew record);
}