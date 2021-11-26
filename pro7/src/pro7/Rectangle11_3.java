package pro7;

public class Rectangle11_3 extends GeometricObject11_1 {
	private double width;
	private double height;
	
	public Rectangle11_3(){
	}
	
	public Rectangle11_3(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public Rectangle11_3(double width,double height,String color,boolean filled){
		this.width=width;
		this.height=height;
		setColor(color);
		setFilled(filled);
	}
	
	/**return width*/
	public double getWidth() {
		return width;
	}
	
	/**return height*/
	public double getHeight() {
		return height;
	}
	
	/**set a new height*/
	public void setHeight(double height) {
		this.height=height;
	}
	
	/**return area*/
	public double getArea() {
		return width*height;
	}
	
	/**return perimeter*/
	public double getPerimeter() {
		return 2*(width+height);
	}
}
