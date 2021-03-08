package com.com.iolist.model;

public class IoListVO {
	
	private String dealDate; // 거래일자
	private String proName;// 상품명
	private String accout;// 거래처명
	private String leader;// 대표자명
	private int num; // 구분
	private int aPrice;// 매입단가
	private int bPrice;// 판매단가
	private int count;// 수량
	
	private int aNum;	// 매입단가 * 수량
	private int bNum;	// 판매단가 * 수량
	
	
	public IoListVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getDealDate() {
		return dealDate;
	}
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getAccout() {
		return accout;
	}
	public void setAccout(String accout) {
		this.accout = accout;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getaPrice() {
		return aPrice;
	}
	public void setaPrice(int aPrice) {
		this.aPrice = aPrice;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getaNum() {
		return aNum;
	}
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	@Override
	public String toString() {
		return "IoListVO [dealDate=" + dealDate + ", proName=" + proName + ", accout=" + accout + ", leader=" + leader
				+ ", num=" + num + ", aPrice=" + aPrice + ", bPrice=" + bPrice + ", count=" + count + ", aNum=" + aNum
				+ ", bNum=" + bNum + "]";
	}
	
	
	
	
	
	
}
