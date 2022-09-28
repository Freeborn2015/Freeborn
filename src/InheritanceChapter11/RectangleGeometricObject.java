package InheritanceChapter11;

public class RectangleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;

    public RectangleGeometricObject(){

    }

    public RectangleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleGeometricObject(String colour, boolean filled, double width, double height) {
        this.width = width;
        this.height = height;
        setColour(colour);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return  width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);

    }

}
