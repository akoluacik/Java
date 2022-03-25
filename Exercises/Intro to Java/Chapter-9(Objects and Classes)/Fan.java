enum SPEED {SLOW, MEDIUM, FAST};
public class Fan {

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        setSpeed(1);
        setOn(false);
        setRadius(5);
        setColor("blue");
    }

    public String toString() {
        return this.speed + " " +this.color + " " + this.radius + " fan is " + (this.on ? "on" : "off"); 
    }

    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public boolean isOn() {
        return on;
    }



    public void setOn(boolean on) {
        this.on = on;
    }



    public double getRadius() {
        return radius;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }



    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan2 = new Fan();
        fan.setSpeed(SPEED.FAST.ordinal() + 1);
        fan.setColor("Yellow");
        fan.setRadius(10);
        fan.setOn(true);
        System.out.println(fan.toString());
        //System.out.println("\n");
        fan2.setSpeed(SPEED.MEDIUM.ordinal() + 1);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }


}
