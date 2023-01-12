package DeepCopyUsingCopyConstructor;

public class DeepCopy {

	public static void main(String[] args) {

		Department dept = new Department("IT", 111);
//		String name=new String("renu");
		Employee e = new Employee("renu", 120000, dept);
		
		Employee e1 = new Employee(e);
		
		System.out.println("Before change e : "+e);
		System.out.println("Before change e1 : "+e1);
		
		e.getDept().setDept("HR");
		
		System.out.println("After change e : "+e);
		System.out.println("After change e1 : "+e1);
		
//		System.out.println(e.salary==e1.salary);
		System.out.println(120000==120000);
		
	}

}
