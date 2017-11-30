package com.yuan.springcloud.service.common.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*  
 * ��ҳģ�幤����
 *
 * */
public final class PageModel implements Serializable {
	/**
	 * Ĭ�ϵ����л��汾 id.
	 */
	private static final long serialVersionUID = 1L;
	private int currentPage=1;// ��ǰҳ
	private int pageSize=10;// ÿҳ��ʾ����
	private int totalPage;// ��ҳ��
	private int totalRecord;// �ܼ�¼��
	private List list = new ArrayList();// ��ҳ����
	private String pageStr;
	private boolean entityOrField = true; // true:��Ҫ��ҳ�ĵط�������Ĳ�������Pageʵ�壻false:��Ҫ��ҳ�ĵط�������Ĳ����������ʵ��ӵ��Page����

	public PageModel() {
	}

	public PageModel(Integer currentPage){
		this.currentPage=currentPage;
	}
	/*
	 * ��ʼ��PageModelʵ��
	 */
	private PageModel(final int pageSize, final String page) {
		// ��ʼ��ÿҳ��ʾ����
		this.pageSize = pageSize;
		// ��ʼ����ҳ��
		setTotalPage();
		// ��ʼ����ǰҳ
		setCurrentPage();

	}
	/*
	 * ��ʼ��PageModelʵ��
	 */
	private PageModel(final int pageSize, final String page,
                      final int totalRecord) {
		// ��ʼ��ÿҳ��ʾ����
		this.pageSize = pageSize;
		// �����ܼ�¼��
		this.totalRecord = totalRecord;
		// ��ʼ����ҳ��
		setTotalPage();
		// ��ʼ����ǰҳ
		setCurrentPage();

	}

	/*
	 * �����PageModelʵ��
	 */
	public static PageModel newPageModel(final int pageSize, final String page,
			final int totalRecord) {

		return new PageModel(pageSize, page, totalRecord);
	}

	// ���õ�ǰ����ҳ
	private void setCurrentPage() {

		// �����ǰҳС�ڵ�һҳʱ����ǰҳָ������ҳ
		if (currentPage < 1) {

			currentPage = 1;
		}

		if (currentPage > totalPage) {

			currentPage = totalPage;

		}

	}

	private void setTotalPage() {
		if (totalRecord % pageSize == 0) {

			totalPage = totalRecord / pageSize;
		} else {
			totalPage = totalRecord / pageSize + 1;
		}
	}

	/*
	 * ��õ�ǰҳ
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/*
	 * �����ҳ��
	 */
	public int getTotalPage() {
		return totalPage;

	}

	/*
	 * ��ÿ�ʼ����
	 */
	public int getStartRow() {
		return (currentPage - 1) * pageSize;
	}

	/*
	 * ��ý�����
	 */
	public int getEndRow() {
		return currentPage * pageSize;
	}
	// ��ҳ
	public int getFirst() {

		return 1;
	}

	// ��һҳ

	public int getPrevious() {

		return currentPage - 1;
	}

	// ��һҳ
	public int getNext() {

		return currentPage + 1;
	}

	// βҳ

	public int getLast() {

		return totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		// ��ʼ����ҳ��
		setTotalPage();
		// ��ʼ����ǰҳ
		setCurrentPage();
	}

	public String getPageStr() {
		return pageStr;
	}

	public void setPageStr(String pageStr) {
		this.pageStr = pageStr;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
}
