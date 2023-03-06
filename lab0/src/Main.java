import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private double calcY(double a, double b, double x) {
        return (Math.pow(Math.sin(Math.pow((Math.pow(x,2)+a),2)),3)-
                Math.sqrt(x/b));
    }
    private double calcZ(double a, double b, double x) {
        return (Math.pow(x, 2)/a)+(Math.cos(Math.pow((x+b),3)));
    }
    private void print(double a, double b, double x, double y, double z) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("////////////////////////////////////////////");
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    private void printDate(Date date){
        System.out.println("////////////////////////////////////////////");
        System.out.printf("%1$tA %1$te %1$tB\n", date);
    }
    private void run() {
        System.out.println("Введіть число a:");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        System.out.println("Введіть число b:");
        double b = s.nextDouble();
        System.out.println("Введіть число x:");
        double x = s.nextDouble();
        double y = calcY(a, b, x);
        double z = calcZ(a, b, x);
        print(a, b, x, y, z);
        Date date = new Date();
        printDate(date);
    }
}