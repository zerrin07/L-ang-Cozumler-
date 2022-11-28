
public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon firstPolygon = new RegularPolygon();
		System.out.println(firstPolygon.getArea());
		System.out.println(firstPolygon.getPerimeter());
		
		
		RegularPolygon SecondPolygon = new RegularPolygon(6,4);
		System.out.println(SecondPolygon.getArea());
		System.out.println(SecondPolygon.getPerimeter());
		
		RegularPolygon ThirdPolygon = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println(ThirdPolygon.getArea());
		System.out.println(ThirdPolygon.getPerimeter());
	}

}
