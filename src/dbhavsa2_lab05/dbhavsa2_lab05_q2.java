package dbhavsa2_lab05;

class Shape { // Create Shape class to instantiate variables and get-set methods
	protected int numberOfSides;
	protected double sideLength;

	protected Shape(double len) {
		sideLength = len;
	}

	protected void setNumberOfSides(int num) {

	}

	protected int getNumberOfSides() {
		return 0;
	}

	protected void setSideLength(double length) {

	}

	protected double getSideLength() {
		return 0;
	}

	public double computeArea() {
		System.out.println("Calling superclass computeArea");
		return 0;
	}

	public double computePerimeter() {
		System.out.println("Calling superclass computerPerimeter");
		return 0;
	}
}

class Square extends Shape { // Inherits all the variables and methods from the Shape class

	public Square(double sideLength) { // Create Square constructor with length parameter
		super(sideLength); // Fills the constructor of the super-class
		setNumberOfSides(4); // Pass in number of sides as 4 and set it accordingly
	}

	@Override // Same name as super-class means overriding the method in the super-class
	protected void setNumberOfSides(int num) { // =Set inherited variable as passed in value
		numberOfSides = num;
	}

	@Override
	protected int getNumberOfSides() { // Unused
		return 0;
	}

	@Override
	protected void setSideLength(double length) { // Set inherited variable to input value
		sideLength = length;
	}

	@Override
	protected double getSideLength() { // Unused
		return 0;
	}

	@Override
	public double computeArea() { // Area = length * width
		super.computeArea(); //Calls superclass function
		return (sideLength * sideLength);
	}

	@Override
	public double computePerimeter() { // Perimeter = sides * length
		super.computePerimeter(); //Calls super class function
		return (numberOfSides * sideLength);
	}

}

class Circle extends Shape { // Inherits all the variables and methods from the Shape class

	protected Circle(double length) { // Create Square constructor with length parameter
		super(length); // Fills the constructor of the super-class
	}

	@Override // Same name as super-class means overriding the method in the super-class
	protected void setNumberOfSides(int num) { // =Set inherited variable as passed in value
		numberOfSides = num;
	}

	@Override
	protected int getNumberOfSides() { // Unused
		return 0;
	}

	@Override
	protected void setSideLength(double length) { // Set inherited variable to input value
		sideLength = length;
	}

	@Override
	protected double getSideLength() { // Unused
		return 0;
	}

	@Override
	public double computeArea() { // Area = pi * r^2
		return (Math.PI * (sideLength * sideLength));
	}

	@Override
	public double computePerimeter() { // Perimeter = 2 * pi * r
		return (2 * Math.PI * sideLength);
	}

}

public class dbhavsa2_lab05_q2 {

	public static void main(String[] args) {
		Square s = new Square(3.6); // Create new object s of class Square which then extends the Shape class
		System.out.println("The area of the square is: " + s.computeArea());
		System.out.println("The perimeter of the square is: " + s.computePerimeter());
	}

}
