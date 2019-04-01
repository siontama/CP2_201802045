/******************************
*
* 컴퓨터프로그래밍 1 (11) HW11
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class ShapeTest {
	public static Shape arrayOfShapes[];	//Shape 객체 배열

	public static void main(String[] args) {
		init();
		drawAll();
	}

	public static void init() {
		arrayOfShapes = new Shape[6];
		arrayOfShapes[0] = new Ellipse(1, 6, 2, 1);		//Ellipse 객체 생성
		arrayOfShapes[1] = new Rectangle(6, 8, 5, 10);	//Rectangle 객체 생성
		arrayOfShapes[2] = new Triangle(3, 4, 5, 10);	//Triangle 객체 생성
		arrayOfShapes[3] = new Sphere(3, 4, 1, 2);		//Sphere 객체 생성
		arrayOfShapes[4] = new Cube(1, 1, 2, 5, 3, 4);	//Cube 객체 생성
		arrayOfShapes[5] = new Cylinder(6, 2, 3, 1, 1);	//Cylinder 객체 생성
	}

	public static void drawAll() {		//모든 Shape 객체 정보 출력
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].print();
		}
	}
}
