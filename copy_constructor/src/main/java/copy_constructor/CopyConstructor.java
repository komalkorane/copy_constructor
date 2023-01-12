package copy_constructor;

public class CopyConstructor {

	public static void main(String[] args) {

		Person p1 = new Person(10,"Ram");
		
		Person p2 = new Person(p1);
	
		System.out.println("p1 :"+p1);
		System.out.println("p2 :"+p2);
		System.out.println(p1 == p2);
	}

}
