/******************************
*
* 컴퓨터프로그래밍 1 (11) HW11
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Shape {
	protected double x, y;

	public Shape(double x, double y) {		//Shape 생성자
		this.x = x;
		this.y = y;
	}
	
	public void print() {		//toString
		System.out.println();
	}
}

class TwoDimShape extends Shape {		//Shape를 상속받은 TwoDimShape 클래스
	public double getArea() {		//2차원도형의 넓이
		return 0;
	}
	
	public TwoDimShape(double x, double y) {	//TwoDimShape 생성자
		super(x, y);
	}
}

class ThreeDimShape extends Shape {		//Shape를 상속받은 ThreeDimShape 클래스
	protected double z;

	public double getVolume() {		//3차원도형의 부피
		return 0;
	}
	
	public ThreeDimShape(double x, double y, double z) {	//ThreeDimShape 생성자
		super(x, y);
		this.z = z;
	}
}

class Ellipse extends TwoDimShape {		//TwoDimshape를 상속받은 Ellipse 클래스
	int semiMinorAxis, semiMajorAxis;

	public double getArea() {		//타원의 넓이
		return 3.14 * semiMinorAxis * semiMajorAxis;
	}
	
	public void print() {		//Ellipse toString
		System.out.println("Ellipse   [ point : (" + x + ", " + y + ") area : " + getArea() + "]");
	}
	
	public Ellipse(double x, double y, int semiMinorAxis, int semiMajorAxis) {	//Ellipse 생성자
		super(x, y);
		this.semiMinorAxis = semiMinorAxis;
		this.semiMajorAxis = semiMajorAxis;
	}
}

class Rectangle extends TwoDimShape {	//TwoDimShape를 상속받은 Rectangle 클래스
	int width, height;

	public double getArea() {		//사각형의 넓이
		return width * height;
	}
	
	public void print() {		//Rectangle toString
		System.out.println("Rectangle [ point : (" + x + ", " + y + ") area : " + getArea() + "]");
	}
	
	public Rectangle(double x, double y, int width, int height) {		//Rectangle 생성자
		super(x, y);
		this.width = width;
		this.height = height;
	}
}

class Triangle extends TwoDimShape {	//TwoDimShape를 상속받은 Triangle 클래스
	int base, height;

	public double getArea() {		//삼각형의 넓이
		return (base * height) / 2;
	}
	
	public void print() {		//Triangle toString
		System.out.println("Triangle  [ point : (" + x + ", " + y + ") area : " + getArea() + "]");
	}
	
	public Triangle(double x, double y, int base, int height) {			//Triangle 생성자
		super(x, y);
		this.base = base;
		this.height = height;
	}
}

class Sphere extends ThreeDimShape {	//ThreeDimShape를 상속받은 Sphere 클래스
	int radius;

	public double getVolume() {		//구의 부피
		return 4 * (3.14 * Math.pow(radius, 3)) / 3;
	}
	
	public void print() {		//Sphere toString
		System.out.println("Shpere    [ point : (" + x + ", " + y + ", " + z + ") volume : " + getVolume() + "]");
	}
	
	public Sphere(double x, double y, double z, int radius) {			//Sphere 생성자
		super(x, y, z);
		this.radius = radius;
	}
}

class Cube extends ThreeDimShape {		//ThreeDimShape를 상속받은 Cube 클래스
	int width, length, height;

	public double getVolume() {		//육면체의 부피
		return width * length * height;
	}
	
	public void print() {		//Cube toString
		System.out.println("Cube      [ point : (" + x + ", " + y + ", " + z + ") volume : " + getVolume() + "]");
	}
	
	public Cube(double x, double y, double z, int width, int length, int height) {	//Cube 생성자
		super(x, y, z);
		this.width = width;
		this.length = length;
		this.height = height;
	}
}

class Cylinder extends ThreeDimShape {		//ThreeDimShape를 상속받은 Cylinder 클래스
	int radius, height;

	public double getVolume() {		//원기둥의 부피
		return 3.14 * Math.pow(radius, 2) * height;
	}
	
	public void print() {		//Cylinder toString
		System.out.println("Cylinder  [ point : (" + x + ", " + y + ", " + z + ") volume : " + getVolume() + "]");
	}
	
	public Cylinder(double x, double y, double z, int radius, int height) {		//Cylinder 생성자
		super(x, y, z);
		this.radius = radius;
		this.height = height;
	}
}
