package pack;

public class Point {
	protected double x;
	protected double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getDistance(Point point) {
		double result;
		result = Math.sqrt(((point.getX() - this.x)*(point.getX() - this.x)) + ((point.getY() - this.y)*(point.getY() - this.y)));
		return result;
	}

}
