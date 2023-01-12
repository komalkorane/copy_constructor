package ShallowCopyUsingCopyConstructor;

// import copy_constructor.Person;

public class Student  {
  
	int roll; 
	String name;
	Address add;
	
	Student(){
		super();
	}
	Student(int roll,String name, Address add){
		this.roll=roll;
		this.name=name;
	    this.add=add;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	Student(Student s){
		this.roll=s.roll;
		this.name=s.name;
		
		this.add=s.add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
