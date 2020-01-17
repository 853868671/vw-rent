package com.vw.rent.controller;


import com.vw.rent.service.DictionaryService;
import com.vw.rent.utils.result.Result;
import com.vw.rent.vo.DictionaryVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "订单相关")
@RestController
@RequestMapping("/order")
public class OrderStatusController {

    @Autowired
    private DictionaryService dictionaryService;
//    @ApiOperation(value = "租赁订单")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "type", value = "1一汽金融，2新动力", required = false, dataType = "Integer")
//    })
    @GetMapping("rentStatus/{type}")
    public Result getRentStatus(@PathVariable Integer type) {
        if (1 == type) {
            List<DictionaryVo> fStatus = dictionaryService.getFawStatus();
            return Result.OK(fStatus);
        } else if (2 == type) {
            List<DictionaryVo> nStatus = dictionaryService.getNewStatus();
            return Result.OK(nStatus);
        } else {
            return Result.FAIL("请求状态错误");
        }
    }
}
