package com.vw.rent.utils.base;

/**
 * 系统常量
 * @author 王卫东 a853868671@gmail.com
 * @date 18-7-10 上午11:18
 * @param
 * @return
 */
public class SysConstant {

    /**
     * 默认每页显示条数
     */
    public final static Integer PAGE_SIZE_DEFAULT = 10;
    /**
     * 分页，默认当前页码
     */
    public final static Integer PAGE_NOW_DEFAULT = 1;
    /**
     * 分页，每页最大显示条数
     */
    public final static Integer PAGE_SIZE_MAX = 50;

    /**
     * result
     * 0: 成功
     * 1: 请求成功，数据为空
     * -1: 失败
     * -2: 超时
     */
    public final static int OK_CODE = 0;
    public final static int EMPTY_CODE = 1;
    public final static int FAIL_CODE = -1;
    public final static int TIMEOUT_CODE = -2;

    /**
     * feign_fallback消息
     */
    public final static int FEIGN_CLIENT_FALLBACK_CODE = -3;
    public static final String FEIGN_CLIENT_FALLBACK_MSG = "feign_fallback_msg";

    /**
     * 统一异常处理，异常定义
     */
    public final static int SYS_EXCEPTION_CODE = -99;
    public final static String SYS_EXCEPTION_MSG = "操作异常";

    /**
     * token过期时间设置
     */
    public final static int TOKEN_EXP_TIME = 2592000;
    /**
     * 短信过期时间
     */
    public final static int SMS_EXP_TIME = 120;

    public final static String TOEKN_SALT = "token-salt-618";
    public final static String TOEKN_RPEPIX = "token_appu_";
    public final static String SMS_REDIS_KEY_RPEPIX = "sms-vw-";

    /**
     * 解决sonar中提到的坏味道，如果都是静态资源，构造方法私有化
     */
    private SysConstant() {
        throw new IllegalAccessError("Utility class");
    }
}
