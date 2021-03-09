package com.callor.student.model;

public class ListVO {

	private int stuNum; //학번
	private String stuName; //학생이름
	private String depart;	//학과
	private int grade;	//학년
	private int intClass; //반
	private String adress; //주소
	private String phone;  //전화번호
	public int getStuNum() {
		return stuNum;
	}
	
	
	
	public ListVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ListVO(int stuNum, String stuName, String depart, int grade, int intClass, String adress, String phone) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.depart = depart;
		this.grade = grade;
		this.intClass = intClass;
		this.adress = adress;
		this.phone = phone;
	}



	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getIntClass() {
		return intClass;
	}
	public void setIntClass(int intClass) {
		this.intClass = intClass;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "ListVO [stuNum=" + stuNum + ", stuName=" + stuName + ", depart=" + depart + ", grade=" + grade
				+ ", intClass=" + intClass + ", adress=" + adress + ", phone=" + phone + "]";
	}
	
	
}
