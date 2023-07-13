interface Myservice{
	void search();
	void sort();
	void getObject();
}
class Impl implements Myservice{

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("search found");
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("sorting done");
	}

	@Override
	public void getObject() {
		// TODO Auto-generated method stub
		System.out.println("you got object");
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myservice service=new Impl();
		service.search();
	}

}
