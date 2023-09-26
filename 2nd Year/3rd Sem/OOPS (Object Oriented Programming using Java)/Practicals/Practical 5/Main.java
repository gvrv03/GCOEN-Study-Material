// Write a program to calculate the area of the rectangle using class

class Rectangle {
    private int Length, breadth, result;

    public Rectangle(int Length, int breadth) {
        this.Length = Length;
        this.breadth = breadth;
    }

    public void calculate() {
        this.result = this.Length * this.breadth;
    }

    public void DisplayResult() {
        System.out.println("--------------- Result ---------------");
        System.out.println("Length is : " + Length);
        System.out.println("breadth is : " + breadth);
        System.out.println("Area of rectangle : " + result);
    }

}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15, 15);
        r1.calculate();
        r1.DisplayResult();

    }
}
