package geomeasure;

public class Line {

    // Encapsulation: hide internal data
    private double x1, y1, x2, y2;

    // Constructor to initialize a line
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;   // this refers to current object
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of line
    public double calculateLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }
}
