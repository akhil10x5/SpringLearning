package com.akhil.springlearning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee
{
	@Id
	@Column(name="empno")
	private int employeeId;
	
	@Column(name="ename")
	private String employeeName;
	
	@Column(name="job")
	private String job;
	
	@Column(name="hiredate")
	private Date hiredDate;
	
	@Column(name="sal")
	private int salary;
	
	@Column(name="deptno")
	private int deptNo;
	
	protected Employee()
	{
		
	}

	public Employee(int employeeId, String employeeName, String job, Date hiredDate, int salary, int deptNo)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.job = job;
		this.hiredDate = hiredDate;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public String getJob()
	{
		return job;
	}

	public void setJob(String job)
	{
		this.job = job;
	}

	public Date getHiredDate()
	{
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate)
	{
		this.hiredDate = hiredDate;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public int getDeptNo()
	{
		return deptNo;
	}

	public void setDeptNo(int deptNo)
	{
		this.deptNo = deptNo;
	}
	
	
}
