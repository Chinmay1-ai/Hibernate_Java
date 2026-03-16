package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instructorId;

	private String name;
	private String specialization;
	private double salary;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(int instructorId, String name, String specialization, double salary, Department department) {
		super();
		this.instructorId = instructorId;
		this.name = name;
		this.specialization = specialization;
		this.salary = salary;
		this.department = department;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", name=" + name + ", specialization=" + specialization
				+ ", salary=" + salary + ", department=" + department + "]";
	}

}
