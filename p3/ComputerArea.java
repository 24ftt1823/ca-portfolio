public class ComputerArea {

    public static void main(String[] args) {
        double base = 4.0;
        double height = 6.0;
        double PI = 3.14;
        double radius = 8.0;

        double areaOfSquare = base * base;
        double areaOfTriangle = 0.5 * base * height;
        double areaOfCircle = PI * radius * radius;
        System.out.println("The area of square is " + areaOfSquare);
        System.out.println("The area of triangle " + areaOfTriangle);
        System.out.println("The area of circle is " + areaOfCircle);
    }
    
}