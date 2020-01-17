package com.vw.rent.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.vw.rent.entity.MidYear;
import com.vw.rent.service.IMidYearService;
import com.vw.rent.utils.result.Result;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 圣承集团2019年年中会议使用的表 前端控制器
 * </p>
 *
 * @author wwd
 * @since 2020-01-14
 */
@RestController
@RequestMapping("/midYear")
public class MidYearController {

    private static Logger logger = LoggerFactory.getLogger(MidYearController.class);

    @Autowired
    IMidYearService midYearService;

    @GetMapping("user/{id}")
    public Result getYearById(@PathVariable("id") int id) {
        MidYear midYearresutl = midYearService.selectById(id);
        return Result.OK(midYearresutl);
    }
    @GetMapping("user")
    public Result user() {
        return Result.OK(midYearService.selectList(new EntityWrapper<MidYear>().eq("name","张盼")));
    }
    @PostMapping("add")
    public Result insert(MidYear midYearUser) {
//        MidYear my = new MidYear();
//
//        BigDecimal price = new BigDecimal(300.99);
//        BigDecimal upper = new BigDecimal(999.99);
//
//        my.setName("张强");
//        my.setPrice(price);
//        my.setUpper(upper);
//        my.setUpdate(new Date().getTime()/1000);

        Result validate = myuValidate((midYearUser));
        if ( validate != null) {
            return validate;
        }

        logger.info(midYearUser.toString());

        midYearService.insert(midYearUser);
        return Result.OK();
    }

    private Result myuValidate(MidYear param) {
        if (param.getName() == null || param.getName().isEmpty()) {
            return Result.FAIL("姓名不能为空");
        }

        if (param.getPrice().compareTo(new BigDecimal(0))<=0) {
            return Result.FAIL("支付不能小于0");
        }

        if (param.getUpper().compareTo(new BigDecimal(100))<= 0) {
            return Result.FAIL("支付上限不能小于100");
        }

        return null;
    }

    @DeleteMapping("delete/{id}")
    public Result delete(@PathVariable("id") int id) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        if (midYearService.deleteByMap(map)) {
            return Result.OK();
        }
        return Result.FAIL("删除失败");
    }
    @PutMapping("up/{id}/{price}")
    public Result updatePrice(@PathVariable("id") int id,@PathVariable("price") double price) {
        MidYear midYearUser = new MidYear();
        midYearUser.setPrice(new BigDecimal(price));
        boolean bool = midYearService.update(midYearUser,new EntityWrapper<MidYear>()
        .eq("id",id)
        );
        return Result.OK(bool);

    }
    @ApiOperation(value = "修改",notes = "put请求")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "price",value = "支付金额值",dataType = "double"),
//            @ApiImplicitParam(name = "upper", value = "支付金额值", dataType = "double")
//    })
    @PutMapping(value = "upa/{id}")
    public Result updateAll(@PathVariable("id") int id, @RequestBody MidYear midYear) {
        MidYear midYearUser = new MidYear();
        midYearUser.setPrice(midYear.getPrice());
        midYear.setUpdate(new Date().getTime()/1000);
        boolean bool = midYearService.update(midYearUser,new EntityWrapper<MidYear>()
                .eq("id",id)
        );
        return Result.OK(bool);
    }
}
