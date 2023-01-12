package copy_constructor;

public class Person {

	int id;
	String name;
	
	Person(){
		super();
	}
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	Person(Person p){
		this.id=p.id;
		this.name=p.name;
	}
	
	public String toString() {
		return "id : "+id+" "+"name : "+name;
	}
	
	
}
