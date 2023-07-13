abstract class AbstractClass {
    // Abstract methods
    public abstract void m1();
    public abstract void m2();

    // Concrete methods
    public void m3() {
        System.out.println("This is concrete method 1");
    }

    public void m4() {
        System.out.println("This is concrete method 2");
    }
} 
class ImplClass extends AbstractClass{

	@Override
	public void m1() {
		System.out.println("m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("m2()");
		
	}
	
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
