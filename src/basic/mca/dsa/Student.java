package basic.mca.dsa;

public class Student {

	public static void main(String[] args) {
		Product p1=new Product("desktop",100,1300);
		Product p2=new Product("desktop",100,1300);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}
}

