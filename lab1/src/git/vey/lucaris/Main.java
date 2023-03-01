package git.vey.lucaris;
import git.vey.lucaris.phone.Phone;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private Phone[] phone;
    public static void main(String[] args) {
        Main main = new Main();

        main.showExceedTimeInCity();

        main.showUsedTalkOutCity();

        main.showInfoOnRange();

        main.printAll();

    }

    public Main(){
        phone = new Phone[3];

        phone[0] = new Phone(1, "Мельник", "Анна", "Маріївна", 2131, 8.7, 5.6);
        phone[1] = new Phone();
    }
    public void showExceedTimeInCity(){
        System.out.println("1//////////////////////////////////////");
        System.out.println("Enter given time in city:");
        Scanner sExceedIn = new Scanner(System.in);
        double timeIn = sExceedIn.nextDouble();
        for (Phone item: phone) {
            if (item.getTalkTimeInCity() > timeIn)
                System.out.println(item.toString());
        }

    }

    public void showUsedTalkOutCity(){
        System.out.println("2//////////////////////////////////////");
        System.out.println("Enter given time out city:");
        Scanner sExceedOut = new Scanner(System.in);
        double timeOut = sExceedOut.nextDouble();
        for (Phone item: phone) {
            if (item.getTalkTimeOutCity() > timeOut)
                System.out.println(item.toString());
        }

    }

    public void showInfoOnRange(){
        System.out.println("Enter the lower limit:");
        Scanner sRange = new Scanner(System.in);
        long range1 = sRange.nextLong();
        System.out.println("Enter the upper limit:");
        long range2 = sRange.nextLong();
        System.out.println("3//////////////////////////////////////");
        for (int i = 0; i<= phone.length; i++){
            if (phone[i].getAccountNumber()>=range1 && phone[i].getAccountNumber()<=range2)
                System.out.println(phone[i].toString());
        }

    }

    public void printAll(){
        System.out.println("4//////////////////////////////////////");
        for (int i = 0; i< phone.length; i++) {
            System.out.println(phone[i]);
        }

    }
}