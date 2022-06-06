package com.gd.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Convert Pojo class to Entity
//@Entity --it tell the java compiler that this is a Hibernate Entity class
//@Table --is used to give the table name for class
@Entity
@Table(name="employee")
public class Employee {

	public Employee() {
	
	}
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//@id --it will convert the id as primary key
	//@GeneratedValue --it will autoincement 
	//@Column --it will behave as coloumnin table
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="salary")
	int salary;
}
