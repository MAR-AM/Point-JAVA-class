public class Point {
    private double abscisse;
    private double ordonne;

    // Default constructor
    public Point() {
        this.abscisse = 0;
        this.ordonne = 0;
    }

    // The Constructor parametre
    public Point(double abscisse, double ordonne) {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }

    // Getter methods
    public double get_abscissse() {
        return this.abscisse;
    }

    public double get_ordonne() {
        return this.ordonne;
    }

    // Setter methods
    public void set_abscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void set_ordonne(double ordonne) {
        this.ordonne = ordonne;
    }

    // Method to calculate distance between two points
    public double distance(Point otherPoint) {
        double x = otherPoint.get_abscissse();
        double y = otherPoint.get_ordonne();
        double a = this.abscisse;
        double b = this.ordonne;

        double distance = Math.pow(Math.pow(a - x, 2) + Math.pow(b - y, 2), 0.5);

        return distance;
    }

    // Method to calculate the distance between the origin and a point 
    public double norm() {
        double a = this.abscisse;
        double b = this.ordonne;

        double distance = Math.pow(a * a + b * b, 0.5);

        return distance;
    }
}
