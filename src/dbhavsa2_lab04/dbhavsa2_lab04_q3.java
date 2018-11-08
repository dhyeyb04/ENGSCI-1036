package dbhavsa2_lab04;

abstract class Shape{ //Create abstract Shape class to instantiate variables and get-set methods
	protected int numberOfSides;
	protected double sideLength;
	
	protected Shape(double len) {
		sideLength = len;
	}
	
	protected abstract void setNumberOfSides(int num);
	protected abstract int getNumberOfSides();
	protected abstract void setSideLength(double length);
	protected abstract double getSideLength();
	public abstract double computeArea();
	public abstract double computePerimeter();
}

class Square extends Shape{ //Inherits all the variables and methods from the Shape class

	protected Square(double length) { //Create Square constructor with length parameter 
		super(length); //Fills the constructor of the super-class
		setNumberOfSides(4); //Pass in number of sides as 4 and set it accordingly
	}

	@Override //Same name as super-class means overriding the method in the super-class
	protected void setNumberOfSides(int num) { //=Set inherited variable as passed in value
		numberOfSides = num;
	}

	@Override
	protected int getNumberOfSides() { //Unused
		return 0;
	}

	@Override
	protected void setSideLength(double length) { //Set inherited variable to input value
		sideLength = length;
	}

	@Override
	protected double getSideLength() { //Unused
		return 0;
	}

	@Override
	public double computeArea() { //Area = length * width
		return (sideLength * sideLength);
	}

	@Override
	public double computePerimeter() { //Perimeter = sides * length
		return (numberOfSides * sideLength);
	}
	
}

public class dbhavsa2_lab04_q3 {

	public static void main(String[] args) {
		Square s = new Square(3.6); //Create new object s of class Square which then extends the Shape class
		System . out . println (" The area of the square is: " + s . computeArea ());
		System . out . println (" The perimeter of the square is: " + s . computePerimeter ());
	}

}
