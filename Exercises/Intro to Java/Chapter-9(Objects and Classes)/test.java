/**
 * test
 */
public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        System.out.println("Before swapping:");
        System.out.println("c1.radius = " + c1.getRadius() + " c2.radius = " + c2.getRadius());
        
        swap1(c1, c2);

        System.out.println("After swapping:");
        System.out.println("c1.radius = " + c1.getRadius() + " c2.radius = " + c2.getRadius());

    }

    public static void swap1(Circle x, Circle y) {
        /*Circle temp = x;
        System.out.println("temp.radius = " + temp.getRadius());
        x = y;
        System.out.println("x.radius = " + x.getRadius());
        y = temp;
        System.out.println("y.radius = " + y.getRadius());*/

        double temp = x.getRadius();
        x.setRadius(y.getRadius());
        y.setRadius(temp);
    }
}