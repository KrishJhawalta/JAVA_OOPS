package Abstraction;

abstract class Shape {
	    abstract void draw();
        abstract void erase();
}

class Circle extends Shape {
    @Override
	    void draw() {
		            System.out.println("Drawing Circle");
			        }
        @Override
        void erase(){
            System.out.println("Erasing everything");
        }
}

public class shape {
	    public static void main(String[] args) {
		            Shape s = new Circle();
			            s.draw();
				        }
}
