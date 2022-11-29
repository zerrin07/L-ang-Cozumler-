import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random(1000);
	//	java.util.Random generator1 = new java.util.Random(1000);
		System.out.print("ILK 50: ");
		for (int i = 0; i < 50; i++)
		 System.out.print(r.nextInt(100) + " ");
	}

	

	

	
	

}
