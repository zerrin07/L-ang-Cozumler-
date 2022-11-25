
public class Rectangle {
private double width =1.0;
private double height = 1.0;

public Rectangle() {
	
}
public Rectangle(double width,double height)
{
	this.setHeight(height);
	this.setWidth(width);
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getArea()
{
	double Area = width * height;
	return Area;
}
public double getPrimeter()
{
	double Primeter = (2*width) + (2*height);
	return Primeter;
}
}
