package com.vw.rent.controller;

import com.vw.rent.utils.random.RandomNum;
import com.vw.rent.utils.result.Result;
import com.vw.rent.ws.ecpDictYsxWrapper.*;
import com.vw.rent.ws.ecpFinProductCalibrationWrapper.*;
import com.vw.rent.ws.requestCommon.RequestHeaderCommon;
import com.vw.rent.ws.requestCommon.ResponseMessageCommon;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 * 一汽金融接口
 * @author 王卫东 a853868671@gmail.com
 * @date 19-3-22
 */
@RestController
@RequestMapping("/fawLeasing")
@Api(value = "/fawLeasing", description = "一汽金融接口")
public class FawLeasingController {

    private final static String FIN_WSDL_URL = "http://127.0.0.1:8000/static/EcpFinProductCalibrationWrapper.xml";

    private final static String DICT_WSDL_URL = "http://127.0.0.1:8000/static/EcpDictYsxWrapper.xml";

    @ApiOperation(value = "校验金融产品")
    @GetMapping("provide/{id}")
    public Result getLoanProvidePlanner (@PathVariable("id") String id) {


        URL url = getWsdlUrl(FIN_WSDL_URL);

        EcpFinProductCalibrationWrapperService ss = new EcpFinProductCalibrationWrapperService(url);

        EcpFinProductCalibrationWrapper port =  ss.getEcpFinProductCalibrationWrapperPort();

        EcpFinProductCalibrationRequestDTO requestDTO = new EcpFinProductCalibrationRequestDTO();

        requestHeaderCommon(requestDTO);

        EcpFinProductCalcParam param = new EcpFinProductCalcParam();

        param.setFinProductId(id);

        requestDTO.setParam(param);

        EcpFinProductCalibrationResponseDTO rt = port.getLoanProvidePlanner(requestDTO);

        return result(rt);

    }
    @GetMapping("getDict")
    public Result getDict() {

        URL url = getWsdlUrl(DICT_WSDL_URL);

        EcpDictYsxWrapperService ss = new EcpDictYsxWrapperService(url);

        EcpDictYsxWrapper port = ss.getEcpDictYsxWrapperPort();

        EcpDictYsxRequestDTO requestDTO = new EcpDictYsxRequestDTO();

        requestHeaderCommon(requestDTO);

        requestDTO.setFactoryType("VWZZ");

        requestDTO.setKey("yqzlanddzdszzysx");

        requestDTO.setProvinceId("wu");

        requestDTO.setType("HIGHESTDEGREE");

        EcpDictYsxResponseDTO rt = null;
        try {
            rt = port.selDictYsxByObject(requestDTO);
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }

        return result(rt);
    }

    private URL getWsdlUrl(String wsdlUrl) {
        URL url = null;
        try {
            url = new URL(wsdlUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    private RequestHeaderCommon requestHeaderCommon(RequestHeaderCommon requestDTO) {
        requestDTO.setApplyKey("13666662366");
        requestDTO.setApplySource("VW_PC");
        requestDTO.setBussType("YSX");
        requestDTO.setComtype(2);
        requestDTO.setPtype(2);
        requestDTO.setSerialNo("ECP"+new Date().getTime( )+ RandomNum.createSmsAuthCode(3));
        return requestDTO;
    }

    private Result result(ResponseMessageCommon rt) {
        if (rt.getRespCode().equals("0000")) {
            return Result.OK(rt);
        }

        if (rt.getRespCode().equals("0001") || rt.getRespCode().equals("0002")) {
            return Result.FAIL(405,rt.getRespMsg());
        }

        return Result.FAIL("服务异常");
    }

}
