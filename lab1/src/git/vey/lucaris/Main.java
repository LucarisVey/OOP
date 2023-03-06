package git.vey.lucaris;
import git.vey.lucaris.phone.Phone;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private Phone[] phones;
    public static void main(String[] args) {
        Main main = new Main();

        main.showExceededTimeInCity();

        main.showUsedTalkOutCity();

        main.showInfoOnRange();

        main.printAll();

    }

    public Main(){
        phones = new Phone[3];

        phones[0] = new Phone(1, "Мельник", "Анна", "Маріївна", 2131, 8.7, 5.6);
        phones[1] = new Phone();
    }
    public void showExceededTimeInCity(){
        System.out.println("1//////////////////////////////////////");
        System.out.println("Enter given time in city:");
        Scanner scanner = new Scanner(System.in);
        double timeIn = scanner.nextDouble();
        for (Phone item: phones) {
            if (item.getTalkTimeInCity() > timeIn)
                System.out.println(item.toString());
        }

    }

    public void showUsedTalkOutCity(){
        System.out.println("2//////////////////////////////////////");
        System.out.println("Enter given time out city:");
        Scanner scanner = new Scanner(System.in);
        double timeOut = scanner.nextDouble();
        for (Phone item: phones) {
            if (item.getTalkTimeOutCity() > timeOut)
                System.out.println(item.toString());
        }

    }

    public void showInfoOnRange(){
        System.out.println("Enter the lower limit of account numbers:");
        Scanner scanner = new Scanner(System.in);
        long range1 = scanner.nextLong();
        System.out.println("Enter the upper limit of account numbers:");
        long range2 = scanner.nextLong();
        System.out.println("3//////////////////////////////////////");
        for (int i = 0; i<= phones.length; i++){
            if (phones[i].getAccountNumber()>=range1 && phones[i].getAccountNumber()<=range2)
                System.out.println(phones[i].toString());
        }

    }

    public void printAll(){
        System.out.println("4//////////////////////////////////////");
        for (int i = 0; i< phones.length; i++) {
            System.out.println(phones[i]);
        }

    }
}