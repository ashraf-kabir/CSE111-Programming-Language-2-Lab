package CSE111lab08.task14;

public class Point {
	
	private double radius;
	
	public Point(double r){
		radius = r;
	}
	double space() {
		System.out.println("Space for a Point can�t be defined");
		return 0;
	}
	protected double getRadius(){
		return radius;
	}

}
