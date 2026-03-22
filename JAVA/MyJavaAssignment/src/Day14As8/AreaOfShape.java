package Day14As8;

class ShapeCalculator{
	void area(int side){
		int Result = side * side;
		System.out.println(Result + " Area Of Square");
	}
	
	void area(int width, int length){
		int Result = length * width;
		System.out.println(Result + " Area Of Rectangle");
	}
	
	void area(double radius){
		double Result = Math.PI*radius*radius;
		System.out.println(Result + " Area Of Circle");
	}
}


public class AreaOfShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalculator sc = new ShapeCalculator();
		sc.area(10);
		sc.area(10,15);
		sc.area(50.5);
	}

}
