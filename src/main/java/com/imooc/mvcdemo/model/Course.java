package com.imooc.mvcdemo.model;

import java.util.List;

public class Course {

	// �γ�Id
	private Integer courseId;
	// �γ�����
	private String title;
	// ͼƬ·��
	private String imgPath;
	// ѧϰ����
	private Integer learningNum;
	// �γ�ʱ��
	private Long duration;
	// �γ��Ѷ�
	private Integer level;
	// �γ��Ѷ�����
	private String levelDesc;
	// �γ̽���
	private String descr;
	// �γ����
	private List<Chapter> chapterList;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLearningNum() {
		return learningNum;
	}

	public void setLearningNum(Integer learningNum) {
		this.learningNum = learningNum;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public List<Chapter> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getLevelDesc() {
		return levelDesc;
	}

	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

}
