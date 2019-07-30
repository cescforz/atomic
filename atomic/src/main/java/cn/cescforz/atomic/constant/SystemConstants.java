package cn.cescforz.atomic.constant;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * <p>©2018 Cesc. All Rights Reserved.</p>
 * <p>Description: 系统常量类</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2018-12-22 20:18
 */
public final class SystemConstants {

    private SystemConstants(){throw new AssertionError();}

    public static final String CONFIRM = "Y";
    public static final String NEGATE = "N";


    /**系统模块类型*/
    public static final Integer FOO_MODULE_TYPE = 1;

    /**
     * 编码格式
     */
    public static final Charset CHARSET_UTF_8 = StandardCharsets.UTF_8;
    public static final String CHARSET_STR_UTF_8 = "UTF-8";


    /**
     * 日期默认格式
     * yyyy-MM-dd hh:mm:ss 12小时制
     * yyyy-MM-dd HH:mm:ss 24小时制
     */
    public static final String DATE_PATTERN_24 = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_PATTERN_12 = "yyyy-MM-dd hh:mm:ss";
    public static final String DEFAULT_TIME_ZONE = "GMT+8";



    /**
     * 加密算法类型
     */
    public static final String ALGORITHM_DES = "DES";
    public static final String ALGORITHM_AES = "AES";
    public static final String ALGORITHM_RSA = "RSA";



    /**CRON表达式:每天凌晨0点*/
    public static final String CRON_AM_00 = "0 0 0 * * ? *";

    /**接口调用切点表达式*/
    public static final String API_POINT_CUT = "execution(* cn.cescforz.foo.controller.api.*.*(..))";

    /**线程池队列类型 -- 有界的任务队列*/
    public static final String QUEUE_TYPE_LIMITED = "LIMITED";
}
