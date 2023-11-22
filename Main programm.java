public class mainPoint {

public static void main(String[] args) {
        // Create 3 points using the default constructor (default x and y coordinates are 0)
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();

        // Change the attributes of points 2 and 3
        point2.set_abscisse(22);
        point2.set_ordonne(8);

        point3.set_abscisse(20);
        point3.set_ordonne(4);

        // Display Point 1
        System.out.println(" Point 1:");
        System.out.println("abscisse x: " + point1.get_abscissse());
        System.out.println("ordonne y: " + point1.get_ordonne());

        // Display Point 2
        System.out.println(" Point 2:");
        System.out.println("abscisse x: " + point2.get_abscissse());
        System.out.println("ordonne y: " + point2.get_ordonne());

        // Display Point 3
        System.out.println(" Point 3:");
        System.out.println("abscisse x: " + point3.get_abscissse());
        System.out.println("ordonne y: " + point3.get_ordonne());

        // Calculate and display distance between Point 2 and Point 3
        System.out.println(" The distance between point 2 and point 3: " + point3.distance(point2)+" cm");

        // Calculate and display distance between Point 2 and the origin
        System.out.println(" The distance between point 2 and the origin : " + point2.norm()+" cm");
        }
}
