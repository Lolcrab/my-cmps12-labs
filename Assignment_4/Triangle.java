package pack;

public class Triangle extends Shape {
	protected Point firstPoint;
	protected Point secondPoint;
	protected Point thirdPoint;
	
	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
	}
	
	public Point getFirstPoint() {
		return this.firstPoint;
	}
	
	public Point getSecondPoint() {
		return this.secondPoint;
	}
	
	public Point getThirdPoint() {
		return this.thirdPoint;
	}
	
	public double getPerimeter() {
		double result = 0;
		result += this.firstPoint.getDistance(this.thirdPoint);
		result += this.secondPoint.getDistance(this.firstPoint);
		result += this.thirdPoint.getDistance(this.secondPoint);
		return result;
	}
	
	public double getArea() {
		double result = 0;
		
		return result;
	}

}
