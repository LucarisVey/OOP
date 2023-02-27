import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private double calcY(double x, double y, double z) {
        return (Math.pow(Math.sin(Math.pow((Math.pow(z,2)+x),2)),3)-Math.sqrt(z/y));
    }
    private double calcZ(double x, double y, double z) {
        return (Math.pow(z, 2)/x)+(Math.cos(Math.pow((z+y),3)));
    }
    private void print(double x, double y, double z, double a, double b) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("////////////////////////////////////////////");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("////////////////////////////////////////////");
        System.out.println("Hello, World!");
    }
    private void printDate(Date date){
        System.out.println("////////////////////////////////////////////");
        System.out.printf("%1$tA %1$te %1$tB\n", date);
    }
    private void run() {
        System.out.println("Введіть число x:");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        System.out.println("Введіть число y:");
        double y = s.nextDouble();
        System.out.println("Введіть число z:");
        double z = s.nextDouble();
        double a = calcY(x, y, z);
        double b = calcZ(x, y, z);
        print(x, y, z, a, b);

        Date date = new Date();
        printDate(date);
    }
}