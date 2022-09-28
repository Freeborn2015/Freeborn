package InheritanceChapter11;

import java.util.Date;

public class SimpleGeometricObject {
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();

    }

    public SimpleGeometricObject(String colour,
                                 boolean filled, Date dateCreated) {
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public  String toString(){
        return "created on " + dateCreated + "\ncolour: " + colour + " and filled: " + filled;
    }
}
