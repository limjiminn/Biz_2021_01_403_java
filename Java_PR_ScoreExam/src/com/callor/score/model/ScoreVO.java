package com.callor.score.model;

public class ScoreVO {
	
	private int stuNum; //학번
	private int kor;	//국어
	private int eng;	//영어
	private int math;	//수학
	private int music;		//음악
	
	private int total;		//총점
	private float avg;		//평균
	
	
	
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreVO(int stuNum, int kor, int eng, int math, int music) {
		super();
		this.stuNum = stuNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [stuNum=" + stuNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	
	
	
	

}
