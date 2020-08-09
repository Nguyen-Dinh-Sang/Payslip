package com.wata.payslip.model.DTO;

public class SearchData {
	private String searchValue;
	private Integer currentPage, pageSize;
	private String sort;

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public SearchData(String searchValue, Integer currentPage, Integer pageSize, String sort) {
		this.searchValue = searchValue;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.sort = sort;
	}

	public SearchData() {

	}
}