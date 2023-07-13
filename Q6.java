@FunctionalInterface
interface MyFuctionalInterface2{
	void service();
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFuctionalInterface2 i=()->{
			System.out.println("implementation of the method");
		};
		i.service();
	}

}
