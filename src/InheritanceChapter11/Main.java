package InheritanceChapter11;

public class Main {
    public static void main(String[] args) {
       CircleSimpleGeometricObject  circle = new CircleSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The colour is " + circle.getColour());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());



        RectangleGeometricObject rectangle = new RectangleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("Area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
