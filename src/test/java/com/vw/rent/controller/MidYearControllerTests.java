package com.vw.rent.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class MidYearControllerTests {

    RestTemplate restTemplate = null;

    @Before
    public void setup() {
        restTemplate = new RestTemplate();
    }

//    @Autowired
//    TestRestTemplate testRestTemplate;
    @Test
    public void test1() {
        String result = restTemplate.getForObject("http://127.0.0.1:9091/test",String.class);
        System.out.println("test：" + result);
        Assert.assertEquals("a",result);
    }
    @Test
    public void getAllTest(){
        String result = restTemplate.getForObject("http://127.0.0.1:9091/all",String.class);


//        System.out.println("test：" + result);

//        System.out.println((new Date().getTime()+"").length());

        JSONObject jsonObject = JSON.parseObject(result);

        if ( jsonObject.get("status").equals(0) ) {

            System.out.println(jsonObject.get("data"));

//            for (Map.Entry<String,Object> entry: jsonObject.entrySet()
//                 ) {
//                System.out.println(entry.getKey() + "=" + entry.getValue());
//
//            }

//            String data = JSONObject.toJSONString(jsonObject.get("data"));


            JSONArray jsonArrayData = jsonObject.getJSONArray("data");


            for (Object object : jsonArrayData) {

                JSONObject jsonObject1 = (JSONObject) object;

                System.out.println("update = " + jsonObject1.getString("update") + " , price = " + jsonObject1.getString("price"));
            }

        } else {
            System.out.println(jsonObject.get("msg"));
        }
    }
    @Test
    public void TestGetJsonParam() {

//        String result = restTemplate.getForObject("http://127.0.0.1:9091/pa",String.class);
//
//        System.out.println(result);

//        Map<String,String> param = new HashMap<>();
//
//        param.put("a","1");
//        param.put("b","2");
//        param.put("c","3");
//        param.put("d","4");
//        param.put("e","5");
//
//        JSONArray.parseArray();

        Header header = (Header) new HttpHeaders();


        String param = "{\"a\":1,\"b\":2,\"c\":3,}";

        String postResult = restTemplate.postForObject("http://127.0.0.1:9091/pa",param,String.class);

        JSONObject jsonObject = JSON.parseObject(postResult);

        System.out.println(jsonObject);

    }
}
