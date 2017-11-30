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
     * �����ʾ�ı��ʣ�1�Ǹ��û��������ݣ�0�ǹ���Ա��������
     * */
    public final static String AD_PERCENTAGE_FLAG_USER = "1";

    public final static String AD_PERCENTAGE_FLAG_ADMIN = "0";

    /**
     * ϵͳ�û���¼��Session����
     */
    public final static String SESSION_USER = "SESSION_USER_NAME";

    public final static String SESSION_LOGIN = "SESSION_LOGIN";

    public final static String SESSION_PASSWORD = "SESSION_PASSWORD";

    public final static String SESSION_LOGINTYPE = "loadType";

    /**
     * ϵͳ�û���¼��Session���Ȩ������
     */
    public final static String SESSION_USER_POPEDOM = "SESSION_USER_POPEDOM_NAME";

    /**
     * ϵͳ����Ա��¼��Session���Ȩ������
     */
    public final static String SESSION_ADMIN_POPEDOM = "SESSION_ADMIN_POPEDOM_NAME";

    /**
     * ϵͳ����Ա��¼��Session����
     */
    public final static String SESSION_ADMIN = "SESSION_ADMIN_NAME";

    /**
     * ǰ̨WEBϵͳ��ҳ��ÿҳ����¼��
     */
    public final static int WEB_PAGE_SIZE = 10;

    /**
     * ǰ̨WEBϵͳ��۶�̬��ҳ��ÿҳ����¼��
     */
    public final static int WEB_PAGE_SIZE_HGDT = 12;
    /**
     * ǰ̨WEBϵͳծȯ��Ϣ��ҳ��ÿҳ����¼��
     */
    public final static int WEB_PAGE_SIZE_ZQXX = 25;

    /**
     * ÿ����Ϣģ��ÿҳ�����ҳ����
     */
    public final static int ADMIN_PAGE_SIZE = 15;

    /**
     * �ɿ�����ϸÿҳ�����ҳ����
     */
    public final static int CER_PAGE_SIZE = 30;

    /**
     * ������Ѷҳ������¼��
     */
    public final static int NEWSMORE_PAGE_SIZE = 50;

    /**
     * WAPϵͳ��ҳ��ÿҳ����¼��
     */
    public final static int WAP_PAGE_SIZE = 8;
    /**
     * WAPϵͳ��ҳ��ÿҳ����¼��
     */
    public final static int WAP_PAGE_SIZE1 = 7;

    /**
     * ���Ȩ�ص����ֵ
     */
    public final static int AD_RANDOM_MAX = 10000000;

    /**
     * ���Ȩ�ص�Ĭ��ֵ
     */
    public final static int AD_RANDOM_BASE = 5;

    /**
     * �ַ��ָ����
     */
    public final static String SPLIT_SIGN = "^";

    /**
     * ����ǰ׺
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

    // ��������
    public final static String ACTION_INSERT = "i";

    public final static String ACTION_DELETE = "d";

    public final static String ACTION_QUERY = "q";

    public final static String ACTION_FORBIDDEN = "f";

    public final static String ACTION_ACTIVE = "a";

    public final static String ACTION_PASS = "p";

    public final static String ACTION_HOLD_BACK = "h";
    // ������¼����
    public final static String CLICK_ACTION_TYPE_ = "h";
    // �ͻ���
    public final static String ACTION_CLIENT_PASS = "Z";
    // ��¼״̬
    public final static int STATUS_NORMAL = 0; // ����

    public final static int STATUS_IS_CHECKING = 1; // �ȴ����

    public final static int STATUS_NOT_PASS = 2; // ���δͨ��

    public final static int STATUS_OVERDUE = 7; // �ѹ���

    public final static int STATUS_FORBIDDEN = 8; // ����,����

    public final static int STATUS_DELETED = 9; // ɾ��

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
    public final static String PATTERN_EMAIL = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";// �ʼ���ַ���ʽ
    public final static String PATTERN_TEL = "^([0-9]{3,4}-)?[0-9]{7,8}$";// �̶��绰
                                                                          // ���ʽ
    public final static String PATTERN_MOBILE = "^(\\+86)?0?1[3|5]\\d{9}$";// �ƶ��绰
                                                                           // ���ʽ

    // Ա������
    public final static String PERSON_TYPE_LEGAL_PERSON = "0";// ����
    public final static String PERSON_TYPE_FINANCIAL_STAFF = "1";// ����
    public final static String PERSON_TYPE_CUSTOMS_DECLARER = "2";// ����Ա

    // ��˲�������
    public final static String OPERATE_TYPE_FOR_APPROVE = "10";// δ�ύ���
    public final static String OPERATE_TYPE_APPROVEING = "11";// �����
    public final static String OPERATE_TYPE_APPROVE_PASS = "12";// ͨ��
    public final static String OPERATE_TYPE_APPROVE_FAIL = "13";// ��ͨ��
    public final static String OPERATE_TYPE_NOT_EMPTY = "9";// ��Ϊ��

    public final static String OPERATE_TYPE_MESSAGE_FAIL = "20";// ���챨��δͨ��
    public final static String OPERATE_TYPE_INTERFACE_FAIL = "21";// �ӿ�δͨ��

    // ���챸����˲�������
    public final static String OPERATE_TYPE_FOR_CHECK = "0";// δ�ύ���
    public final static String OPERATE_TYPE_CHECK_PASS = "1";// ͨ��
    public final static String OPERATE_TYPE_CHECK_FAIL = "2";// ��ͨ��
    public final static String OPERATE_TYPE_CHECKING = "3";// �����

    //����״̬
    public final static String PUSH_NO_NEED = "0";//����Ҫ����
    public final static String PUSH_NEED = "1";//��Ҫ����
    public final static String PUSH_ALREADY = "2";//������
    public final static String PUSH_SUCCESS = "3";//���ͻ�ִ�ɹ�

    // ��˲�������
    public final static String APPROVE_RESULT_PASS = "1";// ���ͨ��
    public final static String APPROVE_RESULT_FAIL = "2";// ����
    public final static String APPROVE_RESULT_ING = "0";// ����

    // �������
    public final static String APPROVE_TYPE_COMPANY = "QYXX";// �̻����
    public final static String APPROVE_TYPE_CARGO = "SPXX";// ��Ʒ
    public final static String APPROVE_TYPE_BRAND = "PPXX";// Ʒ��

    // ���͹���Url
    public final static String SENDMSG_URL_COMPANY = "postCompanyRequest.do";
    public final static String SENDMSG_URL_CARGO = "postCargoRequest.do";
    public final static String SENDMSG_URL_BRAND = "postBrandRequest.do";
    public final static String SENDMSG_SERVER_URL = "http://10.68.5.39:8001/msg-service/";
    public final static String SENDMSG_SERVER_URL_LOCAL = "http://127.0.0.1:7001/msg-service/";

    public final static String EMPTY = "";
    public final static String PATTERN_CODEID = "^[0-9a-zA-Z_]+$";// ������ĸ�»���




	public static final String DES_PUBLIC_ENCRYPT_KEY = "6Ta4OaHZdpA="; //DES����key
	public static final String MESSAGE = "message";//��ʾ��Ϣ
	public static final String PRE_PATH_VIEW = "v_";//��ѯ·��ǰ׺V
	public static final String PRE_PATH_EDIT = "o_";//����·��ǰ׺o

	public final static String CACHE_SYS_FEES_RATE = "CACHE_SYS_FEES_RATE"; //����ȡ����
	public final static String CACHE_SYS_SMTP_CONFIG = "CACHE_SYS_SMTP_CONFIG"; //SMTP ����
	public final static String CACHE_SYS_SMS_CONFIG="CACHE_SYS_SMS_CONFIG";//��������
	public final static String CACHE_SYS_LETTER_TEMPLATES = "CACHE_SYS_LETTER_TEMPLATES";//ģ������
	public final static String CACHE_SYS_CONFIG = "CACHE_SYS_CONFIG";//ģ������
	public final static String CACHE_SYS_AMAZON_CONFIG = "CACHE_SYS_AMAZON_CONFIG"; //����ѷ������Ϣ
	public final static String CACHE_SYS_DICTIONARY_LIST = "CACHE_SYS_DICTIONARY_LIST";//�ֵ��
	public final static String CACHE_SYS_DICTIONARY_MAP = "CACHE_SYS_DICTIONARY_MAP";//�ֵ��
	public final static String FILE_UPLOAD_VIRTUALPATH = "FILE_UPLOAD_VIRTUALPATH";//�ϴ��ļ�����·��
	public final static String ADMIN_URL = "ADMIN_URL";//��̨����·��console


	public static String FILEPATH = "";//����·��
	public static String VIRTUALPATH = "";//�ļ�����·��
	public static final String userModuleName = "user";//�û�
	public static final String commonModuleName = "common";
	public static final String settleModuleName = "settle";//���


	public static final String PAGED_CURPAGE = "pageNum"; //��ǰ�ڼ�ҳ
	public static final String PAGED_NUM_PERPAGE = "numPerPage";//ÿҳ��ʾ������
	public final static String ADMIN_USER_SESSION="ADMIN_USER_SESSION"; //����Աsession
	public final static String FRONT_USER_SESSION="FRONT_USER_SESSION";//ǰ̨��Աsession
	public static final String UTF8 = "UTF-8";//UTF-8����
	public static final String JSESSION_COOKIE = "JSESSIONID";//cookie�е�JSESSIONID����
	public static final String POST = "POST";//HTTP POST����
	public static final String GET = "GET";//HTTP GET����
	public static final String DES_PRIVATE_ENCRYPT_KEY ="o0al4OaEWBzA1";

	public static final String dictionary_currency = "CURRENCY";//�ֵ��??����
	public static final String dictionary_country_code = "COUNTRY_CODE";//�ֵ��??�������


    
}
