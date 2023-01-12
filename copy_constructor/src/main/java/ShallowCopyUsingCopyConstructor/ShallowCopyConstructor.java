package ShallowCopyUsingCopyConstructor;

public class ShallowCopyConstructor {

	public static void main(String[] args) {

		Address add = new Address(1234, "Pune");
		
		Student s = new Student(10, "Komal", add);
		
		Student s2 = new Student(s);
		
		System.out.println(" before change S : "+s);
		System.out.println(" before change S2 : "+s2);
		
		s.getAdd().setCity("Kolhapur");
		
		System.out.println(" After change S : "+s);
		System.out.println(" After change S2 : "+s2);
		
	}

}
