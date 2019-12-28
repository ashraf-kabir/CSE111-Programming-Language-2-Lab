package CSE111lab08.task14;

public class Sphere extends Point {
	
	public Sphere(double n){
		super(n);
	}
	
	public double space(){
		double volume = 4/3.0*Math.PI*getRadius()*getRadius();
		return volume;
	}

}
