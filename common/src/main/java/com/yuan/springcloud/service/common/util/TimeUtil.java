package com.yuan.springcloud.service.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author gaochuanjun
 * @since 15/1/7
 */
public class TimeUtil {

    /**
     * ��ȡ�ȵ�ǰʱ����XX��ë��ʱ��
     *
     * @param expiry ��ʱʱ��
     * @return Date
     */
    public static Date getDateExpiry(long expiry) {
        return new Date(System.currentTimeMillis() + expiry);
    }

    /**
     * ��ȡָ��ʱ���Ӧ�ĺ�����
     *
     * @param time "HH:mm:ss"
     * @return ������
     */
    public static long getTimeMillis(String time) throws ParseException {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);//��������������һ��.����������,������ǰ�ƶ�
        date = calendar.getTime(); //���ʱ���������������һ��Ľ��
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        Date curDate = dateFormat.parse(dayFormat.format(date) + " " + time);
        return curDate.getTime();
    }

    public static Date getCurDate() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        return dateFormat.parse(dayFormat.format(new Date()) + " 00:00:00");

    }

    public static Date getTomorrowDate() throws ParseException {
        return getTomorrowDate("00:00:00");

    }

    public static Date getTomorrowDate(String time) throws ParseException {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);//��������������һ��.����������,������ǰ�ƶ�
        date = calendar.getTime(); //���ʱ���������������һ��Ľ��
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        return dateFormat.parse(dayFormat.format(date) + " " + time);

    }

    public static Date getYesterdayDate() throws ParseException {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -1);//��������������һ��.����������,������ǰ�ƶ�
        date = calendar.getTime(); //���ʱ���������������һ��Ľ��
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        return dateFormat.parse(dayFormat.format(date) + " " + getCurrentTime());

    }

    public static Date getBeforeDate(int before) throws ParseException {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, before);//��������������һ��.����������,������ǰ�ƶ�
        date = calendar.getTime(); //���ʱ���������������һ��Ľ��
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        return dateFormat.parse(dayFormat.format(date) + " " + getCurrentTime());
    }

    public static Date getYesterdayDate(String time) throws ParseException {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -1);//��������������һ��.����������,������ǰ�ƶ�
        date = calendar.getTime(); //���ʱ���������������һ��Ľ��
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        return dateFormat.parse(dayFormat.format(date) + " " + time);

    }

    public static String getCurrentTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        return timeFormat.format(new Date());
    }

    public static String getCurrentTimeNoFormat() {
        DateFormat timeFormat = new SimpleDateFormat("yyMMddHHmmss");
        return timeFormat.format(new Date());
    }

    public static Date getDate(long milliseconds) throws ParseException {
        return new Date(milliseconds);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(getBeforeDate(-1));
    }
}
