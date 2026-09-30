package com.project.university;

public class NewClass {
	int class_id;
	String class_name;
	int academic_year;
	int class_position;
	String language;
	int student_id_start;
	int seat;
	public NewClass() {
		super();
	}
	public NewClass(int class_id, String class_name, int academic_year, int class_position, String language,
			int student_id_start, int seat) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.academic_year = academic_year;
		this.class_position = class_position;
		this.language = language;
		this.student_id_start = student_id_start;
		this.seat = seat;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getAcademic_year() {
		return academic_year;
	}
	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}
	public int getClass_position() {
		return class_position;
	}
	public void setClass_position(int class_position) {
		this.class_position = class_position;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getStudent_id_start() {
		return student_id_start;
	}
	public void setStudent_id_start(int student_id_start) {
		this.student_id_start = student_id_start;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "NewClass [class_id=" + class_id + ", class_name=" + class_name + ", academic_year=" + academic_year
				+ ", class_position=" + class_position + ", language=" + language + ", student_id_start="
				+ student_id_start + ", seat=" + seat + ", getClass_id()=" + getClass_id() + ", getClass_name()="
				+ getClass_name() + ", getAcademic_year()=" + getAcademic_year() + ", getClass_position()="
				+ getClass_position() + ", getLanguage()=" + getLanguage() + ", getStudent_id_start()="
				+ getStudent_id_start() + ", getSeat()=" + getSeat() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
