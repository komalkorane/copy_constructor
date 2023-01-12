package DeepCopyUsingCopyConstructor;

public class Employee {

	String name;
	int salary;
	Department dept;
	
	Employee(){
		super();
	}

	public Employee(String name, int salary, Department dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	Employee(Employee e){
		this.name=e.name;
		this.salary=e.salary;
		
		Department d = new Department(e.dept);
		this.dept=d;
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
