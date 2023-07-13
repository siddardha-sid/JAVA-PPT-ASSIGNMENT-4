
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread(()->{
for(int i=0;i<5;i++) {
	System.out.println("child thread");
}
}).start();
	}

}
