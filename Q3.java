@FunctionalInterface
interface MyFuctionalInterface{
	void service();
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFuctionalInterface i=()->{
			System.out.println("implementation of the method");
		};
		i.service();
	}

}
