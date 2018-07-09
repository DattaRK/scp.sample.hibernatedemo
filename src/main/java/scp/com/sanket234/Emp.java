package scp.com.sanket234;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_details")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TYPE")
@DiscriminatorValue(value="EMP")
public class Emp {
	@Id
	int empId;
	String fname;
	String lname;
	int salary;
	
	
	
	
	public Emp(int empId, String fname, String lname, int salary) {
		super();
		this.empId=empId;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		
		
		
		
		
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}


@Entity
@DiscriminatorValue(value="C_emp")
		class Cemp extends Emp{
			String address;

			public Cemp(int empId, String fname, String lname, int salary, String address) {
				super(empId, fname, lname, salary);
				this.address = address;
			}

			public Cemp() {
				super();
				// TODO Auto-generated constructor stub
			}		
			
		}

