
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle Rectangle1 = new Rectangle(4,40);
		Rectangle Rectangle2= new Rectangle(3.5, 35.9);
		
		System.out.printf("First Rectangle1 Area:" + Rectangle1.getArea());
		System.out.printf("\nFirst Rectangle1 Primeter:" + Rectangle1.getPrimeter());
		
		System.out.printf("\nFirst Rectangle2 Area:" + Rectangle2.getArea());
		System.out.printf("\nFirst Rectangle2 Primeter:" + Rectangle2.getPrimeter());
	}

}
