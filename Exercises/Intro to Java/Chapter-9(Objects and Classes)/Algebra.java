import java.util.Scanner;

public class Algebra {
    double a, b, c, d, e, f;
    public Algebra(double a, double b, double c, double d, double e, double f) {
        setA(a);
        setB(b);
        setC(c);
        setD(d);
        setE(e);
        setF(f);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }


    public boolean isSolvable() {
        return a*d-b*c != 0;
    }


    public double getX() {
        return (e*d - b*f) / (a*d - b*c);
    }


    public double getY() {
        return (a*f - e*c) / (a*d - b*c);
    }


    public double getA() {
        return a;
    }



    public void setA(double a) {
        this.a = a;
    }



    public double getB() {
        return b;
    }



    public void setB(double b) {
        this.b = b;
    }



    public double getC() {
        return c;
    }



    public void setC(double c) {
        this.c = c;
    }



    public double getD() {
        return d;
    }



    public void setD(double d) {
        this.d = d;
    }



    public double getE() {
        return e;
    }



    public void setE(double e) {
        this.e = e;
    }



    public double getF() {
        return f;
    }



    public void setF(double f) {
        this.f = f;
    }



    /*public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter a, b, c, d, e, f for\n ax+by=e\ncx+dy=f");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        
        Algebra alg = new Algebra(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        System.out.println("The equation is " + (alg.isSolvable() ? "" : "not") + " solvable");
        System.out.print("The solution is x: " + alg.getX() + " y: " + alg.getY());

    }*/
}
