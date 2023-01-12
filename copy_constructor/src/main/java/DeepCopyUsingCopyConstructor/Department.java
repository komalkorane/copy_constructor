package DeepCopyUsingCopyConstructor;

public class Department {

	String dept;
	int id;
	
	Department(Department d){
	    this.dept=d.dept;
	    this.id=d.id;
	}
	Department(String dept, int id){
		this.dept=dept;
		this.id=id;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Department [dept=" + dept + ", id=" + id + "]";
	}
	
	
	
}
