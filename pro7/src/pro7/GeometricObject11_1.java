package pro7;

public class GeometricObject11_1 {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	
	public GeometricObject11_1() {
		dateCreated=new java.util.Date();
	}
	
	
	public GeometricObject11_1(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	/**return color*/
	public String getColor() {
		return color;
	}
	
	/**set a new color*/
	public void setColor(String color) {
		this.color=color;
	}
	
	/**return filled.since filled is boolean,
	 * its getter method is named isFilled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**Set a new filled*/
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	
	/**get dateCreated*/
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	/**return a string representation of this object*/
	public String toString() {
		return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
}
