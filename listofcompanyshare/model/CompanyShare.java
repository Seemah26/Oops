package com.bridgelabz.listofcompanyshare.model;

import java.util.List;

import com.bridgelabz.opps.commonmethods.CustomLinkedList;

public class CompanyShare {
	private String comapanyName;
	private Long noOfShare;
	private List<CompanyShare> list;

	public List<CompanyShare> getList() {
		return list;
	}

	public void setList(CustomLinkedList linkedList) {
		this.list = (List<CompanyShare>) linkedList;
	}

	public String getComapanyName() {
		return comapanyName;
	}

	public String setComapanyName(String comapanyName) {
		return this.comapanyName = comapanyName;
	}

	public Long getNoOfShare() {
		return noOfShare;
	}

	public Long setNoOfShare(Long noOfShare2) {
		return this.noOfShare = noOfShare2;
	}

	@Override
	public String toString() {
		return "name  : " + comapanyName + "\n" + "number of share: " + noOfShare + "\n";
	}
}
