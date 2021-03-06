/**
 * Copyright : www.easipay.net , 2011-2012
 * Project : PEPP
 * $Id$
 * $Revision$
 * Last Changed by $Author$ at $Date$
 * $URL$
 * 
 * Change Log
 * Author      Change Date    Comments
 *-------------------------------------------------------------
 * zhangyl     2012-9-18        Initailized
 */

package com.yuan.springcloud.service.common.util;

import java.util.Locale;


public class Constants {

    /**
     * 广告显示的比率，1是给用户看的数据，0是管理员看的数据
     * */
    public final static String AD_PERCENTAGE_FLAG_USER = "1";

    public final static String AD_PERCENTAGE_FLAG_ADMIN = "0";

    /**
     * 系统用户登录的Session名称
     */
    public final static String SESSION_USER = "SESSION_USER_NAME";

    public final static String SESSION_LOGIN = "SESSION_LOGIN";

    public final static String SESSION_PASSWORD = "SESSION_PASSWORD";

    public final static String SESSION_LOGINTYPE = "loadType";

    /**
     * 系统用户登录的Session后的权限名称
     */
    public final static String SESSION_USER_POPEDOM = "SESSION_USER_POPEDOM_NAME";

    /**
     * 系统管理员登录的Session后的权限名称
     */
    public final static String SESSION_ADMIN_POPEDOM = "SESSION_ADMIN_POPEDOM_NAME";

    /**
     * 系统管理员登录的Session名称
     */
    public final static String SESSION_ADMIN = "SESSION_ADMIN_NAME";

    /**
     * 前台WEB系统分页中每页最大记录数
     */
    public final static int WEB_PAGE_SIZE = 10;

    /**
     * 前台WEB系统宏观动态分页中每页最大记录数
     */
    public final static int WEB_PAGE_SIZE_HGDT = 12;
    /**
     * 前台WEB系统债券信息分页中每页最大记录数
     */
    public final static int WEB_PAGE_SIZE_ZQXX = 25;

    /**
     * 每日信息模块每页的最大页面数
     */
    public final static int ADMIN_PAGE_SIZE = 15;

    /**
     * 缴款书明细每页的最大页面数
     */
    public final static int CER_PAGE_SIZE = 30;

    /**
     * 更多资讯页面最大记录数
     */
    public final static int NEWSMORE_PAGE_SIZE = 50;

    /**
     * WAP系统分页中每页最大记录数
     */
    public final static int WAP_PAGE_SIZE = 8;
    /**
     * WAP系统分页中每页最大记录数
     */
    public final static int WAP_PAGE_SIZE1 = 7;

    /**
     * 随机权重的最大值
     */
    public final static int AD_RANDOM_MAX = 10000000;

    /**
     * 随机权重的默认值
     */
    public final static int AD_RANDOM_BASE = 5;

    /**
     * 字符分割符号
     */
    public final static String SPLIT_SIGN = "^";

    /**
     * 参数前缀
     */
    public final static String PARAM_PREFIX = "pf_";

    public final static String DEFAULT_TIMEZONE = "GMT+8";

    public final static Locale DEFAULT_LOCALE = Locale.CHINA;

    public final static String DEFAULT_ENCODINIG = "UTF-8";

    public final static String DATABASE_CHARSET = "UTF-8";

    public final static int DEFAULT_SESSION_TIMEOUT = 600; // second

    public final static int CAT_SPAN_LENGTH = 3;

    public final static int AD_CODE_PK_LENGTH = 6;

    public final static String DEFAULT_CAT_START = "001";

    public final static int DATA_STRING = 0;

    public final static int DATA_INTEGER = 1;

    public final static int DATA_LONG = 2;

    public final static int DATA_DOUBLE = 3;

    public final static int DATA_DATE = 4;

    public final static int TASK_STATUS_ERROR = 0;

    public final static int TASK_STATUS_ACCEPTED = 1;

    public final static int TASK_STATUS_EXECUTING = 2;

    public final static int TASK_STATUS_FILE_CREATED = 3;

    public final static int TASK_STATUS_PARTIAL_COMPLETED = 4;

    public final static int TASK_STATUS_ALL_COMPLETED = 5;

    public final static int TASK_STATUS_CACELED = 6;

    // 操作动作
    public final static String ACTION_INSERT = "i";

    public final static String ACTION_DELETE = "d";

    public final static String ACTION_QUERY = "q";

    public final static String ACTION_FORBIDDEN = "f";

    public final static String ACTION_ACTIVE = "a";

    public final static String ACTION_PASS = "p";

    public final static String ACTION_HOLD_BACK = "h";
    // 流量记录类型
    public final static String CLICK_ACTION_TYPE_ = "h";
    // 客户端
    public final static String ACTION_CLIENT_PASS = "Z";
    // 记录状态
    public final static int STATUS_NORMAL = 0; // 正常

    public final static int STATUS_IS_CHECKING = 1; // 等待审核

    public final static int STATUS_NOT_PASS = 2; // 审核未通过

    public final static int STATUS_OVERDUE = 7; // 已过期

    public final static int STATUS_FORBIDDEN = 8; // 禁用,冻结

    public final static int STATUS_DELETED = 9; // 删除

    // result dao code
    public final static int CODE_DEFAULT_RESULT = -1;

    public final static int CODE_DAO_SUCCESS = 1;

    public final static int CODE_DAO_FAILURE = -1;
    // client manager
    public final static String CODE_CLINET_APPLY = "500";
    // result code
    public final static String CODE_SUCCESS = "0";

    public final static String CODE_PARAMETER_ERROR = "1";

    public final static String CODE_DATABASE_ACCESS_ERROR = "2";

    public final static String CODE_UNSUPPORTED_COMMAND_ERROR = "3";

    public final static String CODE_NO_PERMISSION_ERROR = "4";

    public final static String CODE_INVALID = "5";

    public final static String CODE_MAXLENGTH = "6";

    public final static String CODE_MINLENGTH = "7";

    public final static String CODE_RANGE = "8";

    public final static String CODE_REQUIRED = "9";

    public final static String CODE_BYTE = "10";

    public final static String CODE_DATE = "11";

    public final static String CODE_DOUBLE = "12";

    public final static String CODE_FLOAT = "13";

    public final static String CODE_INTEGER = "14";

    public final static String CODE_LONG = "15";

    public final static String CODE_SHORT = "16";

    public final static String CODE_CREDITCARD = "17";

    public final static String CODE_EMAIL = "18";

    public final static String CODE_NOT_EXISTS = "19";

    public final static String CODE_UNIQUE = "20";

    public final static String CODE_USERNAME_PASSWORD_NOT_MATCH = "21";

    public final static String CODE_NEED_LOGIN = "22";

    public final static String CODE_NO_MATCHED_RECORD = "23";

    public final static String CODE_INVALID_LICENSE = "24";

    public final static String CODE_CAMERA_AMOUNT_EXCEED = "25";

    public final static String CODE_USER_AMOUNT_EXCEED = "26";

    public final static String CODE_IN_USING = "27";

    public final static String CODE_CANNOT_BE_DELETE = "28";

    public final static String CODE_XML_INVALID = "29";

    public final static String CODE_CANNOT_GET_JDBC_CONNECTION = "30";

    public final static String CODE_PARAMETER_REQUIRE = "31";

    public final static String CODE_UNKNOWN_ERROR = "99";

    // Exception code from gpio
    public final static String CODE_GPIO_INVALID = "100";

    public final static String CODE_DELETE_AREA_WITH_SUBITEM_ERROR = "101";

    public final static String CODE_CANNOT_DELETE_ROOT_AREA = "102";

    public final static String CODE_NEED_STOP_ALL_TASK_BEFORE_DELETE_SA = "105";

    public final static String CODE_NOT_APPOINT_AREA = "106";

    public final static String CODE_PAIR_PARAMS_NOT_EQUALS = "200";

    public final static String CODE_SA_EERORS = "201";

    public final static String CODE_NOT_THE_SAME = "202";

    public final static String CODE_CAMEREA_IN_OTHER_GROUPS = "203";

    public final static String CODE_NEED_BACKUP_BEFORE_CLEAN = "204";

    public final static String CODE_TASK_HAS_BEEN_CANCELED = "205";

    public final static String CODE_TIME_OUT_RANGE = "206";

    public final static String CODE_START_TIME_LARGER = "207";

    // Exception Code from CSG
    public final static String CODE_CONTROLPTZ_FAILED = "300";

    public final static String CODE_DELETEVSUSER_FAILED = "301";

    public final static String CODE_SETVSIMAGEADJUSTING_FAILED = "302";

    public final static String CODE_SETVSIMAGEFORMAT_FAILED = "303";

    public final static String CODE_SETVSSERIALPORT_FAILED = "304";

    public final static String CODE_SETVSUSER_FAILED = "305";

    public final static String CODE_SETVSVIDEO_FAILED = "306";

    public final static String CODE_SUBSCRIBEALARM_FAILED = "307";

    public final static String CODE_VISIT_NVS_ERROR = "308";

    public final static String CODE_UNSUPPORTED_PTZ_PROTOCOL = "309";

    public final static String CODE_UNSUPPORTED_PTZ_PROTOCOL_COMMAND = "310";

    public final static String CODE_UNSUPPORTED_ACTION = "311";

    public final static String CODE_SETVSIMGPARAM_FAILED = "312";

    public final static String CODE_VS_AUTHENTICATE_FAILED = "313";

    public final static String CODE_SETVSIPINFO_FAILED = "314";

    public final static String CODE_SETGPIODEVICE_FAILED = "315";

    public final static String CODE_SETVSTIME_FAILED = "316";

    public final static String CODE_UNSUPPORT_VS_VENDOR = "317";

    public final static String CODE_SETDECODER_FAILED = "318";

    public final static String CODE_CONTROLVS_FAILED = "319";

    public final static String CODE_SET_VS_LOCAL_STORAGE_TASK_FAILED = "320";

    public final static String CODE_STOP_VS_LOCAL_STORAGE_TASK_FAILED = "321";

    public final static String CODE_ISEMPTY = "00";

    // Pattern
    public final static String PATTERN_EMAIL = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";// 邮件地址表达式
    public final static String PATTERN_TEL = "^([0-9]{3,4}-)?[0-9]{7,8}$";// 固定电话
                                                                          // 表达式
    public final static String PATTERN_MOBILE = "^(\\+86)?0?1[3|5]\\d{9}$";// 移动电话
                                                                           // 表达式

    // 员工类型
    public final static String PERSON_TYPE_LEGAL_PERSON = "0";// 法人
    public final static String PERSON_TYPE_FINANCIAL_STAFF = "1";// 财务
    public final static String PERSON_TYPE_CUSTOMS_DECLARER = "2";// 报关员

    // 审核操作类型
    public final static String OPERATE_TYPE_FOR_APPROVE = "10";// 未提交审核
    public final static String OPERATE_TYPE_APPROVEING = "11";// 审核中
    public final static String OPERATE_TYPE_APPROVE_PASS = "12";// 通过
    public final static String OPERATE_TYPE_APPROVE_FAIL = "13";// 不通过
    public final static String OPERATE_TYPE_NOT_EMPTY = "9";// 不为空

    public final static String OPERATE_TYPE_MESSAGE_FAIL = "20";// 国检报文未通过
    public final static String OPERATE_TYPE_INTERFACE_FAIL = "21";// 接口未通过

    // 国检备案审核操作类型
    public final static String OPERATE_TYPE_FOR_CHECK = "0";// 未提交审核
    public final static String OPERATE_TYPE_CHECK_PASS = "1";// 通过
    public final static String OPERATE_TYPE_CHECK_FAIL = "2";// 不通过
    public final static String OPERATE_TYPE_CHECKING = "3";// 审核中

    //推送状态
    public final static String PUSH_NO_NEED = "0";//不需要推送
    public final static String PUSH_NEED = "1";//需要推送
    public final static String PUSH_ALREADY = "2";//已推送
    public final static String PUSH_SUCCESS = "3";//推送回执成功

    // 审核操作类型
    public final static String APPROVE_RESULT_PASS = "1";// 审核通过
    public final static String APPROVE_RESULT_FAIL = "2";// 驳回
    public final static String APPROVE_RESULT_ING = "0";// 驳回

    // 审核类型
    public final static String APPROVE_TYPE_COMPANY = "QYXX";// 商户审核
    public final static String APPROVE_TYPE_CARGO = "SPXX";// 商品
    public final static String APPROVE_TYPE_BRAND = "PPXX";// 品牌

    // 发送国检Url
    public final static String SENDMSG_URL_COMPANY = "postCompanyRequest.do";
    public final static String SENDMSG_URL_CARGO = "postCargoRequest.do";
    public final static String SENDMSG_URL_BRAND = "postBrandRequest.do";
    public final static String SENDMSG_SERVER_URL = "http://10.68.5.39:8001/msg-service/";
    public final static String SENDMSG_SERVER_URL_LOCAL = "http://127.0.0.1:7001/msg-service/";

    public final static String EMPTY = "";
    public final static String PATTERN_CODEID = "^[0-9a-zA-Z_]+$";// 数字字母下划线




	public static final String DES_PUBLIC_ENCRYPT_KEY = "6Ta4OaHZdpA="; //DES加密key
	public static final String MESSAGE = "message";//提示信息
	public static final String PRE_PATH_VIEW = "v_";//查询路径前缀V
	public static final String PRE_PATH_EDIT = "o_";//更新路径前缀o

	public final static String CACHE_SYS_FEES_RATE = "CACHE_SYS_FEES_RATE"; //缓存取费率
	public final static String CACHE_SYS_SMTP_CONFIG = "CACHE_SYS_SMTP_CONFIG"; //SMTP 配置
	public final static String CACHE_SYS_SMS_CONFIG="CACHE_SYS_SMS_CONFIG";//短信配置
	public final static String CACHE_SYS_LETTER_TEMPLATES = "CACHE_SYS_LETTER_TEMPLATES";//模板配置
	public final static String CACHE_SYS_CONFIG = "CACHE_SYS_CONFIG";//模板配置
	public final static String CACHE_SYS_AMAZON_CONFIG = "CACHE_SYS_AMAZON_CONFIG"; //亚马逊配置信息
	public final static String CACHE_SYS_DICTIONARY_LIST = "CACHE_SYS_DICTIONARY_LIST";//字典表
	public final static String CACHE_SYS_DICTIONARY_MAP = "CACHE_SYS_DICTIONARY_MAP";//字典表
	public final static String FILE_UPLOAD_VIRTUALPATH = "FILE_UPLOAD_VIRTUALPATH";//上传文件虚拟路径
	public final static String ADMIN_URL = "ADMIN_URL";//后台请求路径console


	public static String FILEPATH = "";//附件路径
	public static String VIRTUALPATH = "";//文件虚拟路径
	public static final String userModuleName = "user";//用户
	public static final String commonModuleName = "common";
	public static final String settleModuleName = "settle";//结汇


	public static final String PAGED_CURPAGE = "pageNum"; //当前第几页
	public static final String PAGED_NUM_PERPAGE = "numPerPage";//每页显示多少条
	public final static String ADMIN_USER_SESSION="ADMIN_USER_SESSION"; //管理员session
	public final static String FRONT_USER_SESSION="FRONT_USER_SESSION";//前台会员session
	public static final String UTF8 = "UTF-8";//UTF-8编码
	public static final String JSESSION_COOKIE = "JSESSIONID";//cookie中的JSESSIONID名称
	public static final String POST = "POST";//HTTP POST请求
	public static final String GET = "GET";//HTTP GET请求
	public static final String DES_PRIVATE_ENCRYPT_KEY ="o0al4OaEWBzA1";

	public static final String dictionary_currency = "CURRENCY";//字典表??币制
	public static final String dictionary_country_code = "COUNTRY_CODE";//字典表??国别代码


    
}
