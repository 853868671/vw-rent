package com.vw.rent.utils.exceptions;


import com.vw.rent.utils.exceptions.enums.BizExceptionEnum;

/**
 * @author 王卫东 a853868671@gmail.com
 * @version V1.0
 * @Title: BizException.java
 * @Description: 业务异常类，包装更多信息，比如code
 *                  一定要继承RuntimeException。因为spring事务只有RuntimeException才会回滚
 *
 * 异常code定义： (目前凭空列举的例子，到时候具体拆分)
 *
 *      微服务: customer   : 1001 + 四位异常code  例如：10010001
 *      微服务: employee   : 2001 + 四位异常code  例如：20010001
 *      微服务: order      : 3001 + 四位异常code  例如：30010001
 *      微服务: store      : 4001 + 四位异常code  例如：40010001
 *      微服务: support    : 5001 + 四位异常code  例如：50010001
 *      微服务: thirdparty : 6001 + 四位异常code  例如：60010001
 *      微服务: user       : 7001 + 四位异常code  例如：70010001
 *      网  关:gataway-customer: 8001 + 四位异常code  例如：80010001
 *      网  关:gataway-steward:  9001 + 四位异常code  例如：90010001
 *
 * @date 2018-07-10 22:39:40
 */
public class BizException extends RuntimeException{
    /**错误编码*/
    private int code;

    /**
     * 构造方法
     * @param bizExceptionEnum
     */
    public BizException(BizExceptionEnum bizExceptionEnum){
        super(bizExceptionEnum.getMsg());
        this.code = bizExceptionEnum.getCode();
    }

    /**
     * 构造方法
     * @param code
     * @param msg
     */
    public BizException(int code, String msg){
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static void main(String[] args) {
        String msgFormat = "%s:你是谁?%s回答:%s?";
        String[] sts = new String[]{"aaa","bbb","啥"};
        String format = String.format(msgFormat, sts);
        System.out.println(format);
    }
}
