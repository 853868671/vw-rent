package com.vw.rent.ws;

import com.alibaba.fastjson.JSONObject;
import com.vw.rent.utils.random.RandomNum;
import com.vw.rent.ws.ecpFinProductCalibrationWrapper.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Date;

public class WSClient {

    public static void main(String[] args) throws MalformedURLException {
        System.out.println("--------------");

        System.out.println(LocalDateTime.now());

        URL url = new URL("http://127.0.0.1:8000/static/EcpFinProductCalibrationWrapper.xml");

        EcpFinProductCalibrationWrapperService ss = new EcpFinProductCalibrationWrapperService(url);

        EcpFinProductCalibrationWrapper port =  ss.getEcpFinProductCalibrationWrapperPort();

        EcpFinProductCalibrationRequestDTO requestDTO = new EcpFinProductCalibrationRequestDTO();

        requestDTO.setApplyKey("13666662366");
        requestDTO.setApplySource("VW_PC");
        requestDTO.setBussType("YSX");
        requestDTO.setComtype(2); // 都有什么类型？
        requestDTO.setPtype(2); // 都有什么类型？
        requestDTO.setSerialNo("ECP"+new Date().getTime( )+ RandomNum.createSmsAuthCode(3));

        EcpFinProductCalcParam param = new EcpFinProductCalcParam();

        param.setFinProductId("FN002");

        requestDTO.setParam(param);

        EcpFinProductCalibrationResponseDTO rt = port.getLoanProvidePlanner(requestDTO);

        System.out.println(JSONObject.toJSON(rt));

        System.out.println("rt=" + rt.getRespCode()+";"+rt.getRespMsg()+";"+rt.getSerialNo());

        System.out.println(LocalDateTime.now());

    }

}
