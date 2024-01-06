package Homework0105;

abstract class Shape {
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition(){
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}
class Point {
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
		
		
		}
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape{
	double r;
	@Override
	double calcArea() {
		return Math.PI*r*r;
	}
	Circle (double r){
		this.r = r;
	}
}
class Rectangle extends Shape{
	double width;
	double height;
	@Override
	double calcArea() {
		return width*height;
	}
	Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		boolean check = false;
		if(width == height)
			check = true;
		System.out.println("위 도형은 정사각형입니다.");
		return check;
	}
}

public class Exercise7_22 {

}
