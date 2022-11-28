import java.math.*;
public class RegularPolygon {
  private int n;
  private double side;
  private double x;
  private double y;
  
  
  public RegularPolygon()
  {
	  this.n=3;
      this.side=1.0;
      this.x=0.0;
      this.y=0.0;
  }
 public RegularPolygon(int n,double side)
 {
	 this.n=n;
	 this.side=side;
	 this.x=0.0;
	 this.y=0.0;
 }
  public RegularPolygon(int n,double side,double x,double y)
  {
	  this.n=n;
	  this.side=side;
	  this.x=x;
	  this.y=y;
  }
  
  
  public int  getPerimeter()
  {
	 int perimeter = n*n;
	 return perimeter;
	  
  }
  public double getArea()
  {
	  double Area = (n*(side*side))/ (4*Math.atan2(3.14, n));
	  return Area;
  }
  
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public double getSide() {
	return side;
}
public void setSide(double side) {
	this.side = side;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
  
  
  
  
}
