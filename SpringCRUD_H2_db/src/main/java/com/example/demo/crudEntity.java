package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class crudEntity {
	@Id
//	@GeneratedValue
	@Column
	private long studentId;
	@Column
	private String sName;

	@Column
//	@Min(value = 0, message = "Marks must be a positive number")
	private int sMarks;

	@Column
	private String sCityName;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	public String getsCityName() {
		return sCityName;
	}

	public void setsCityName(String sCityName) {
		this.sCityName = sCityName;
	}

}
