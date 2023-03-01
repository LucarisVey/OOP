package git.vey.lucaris;
import git.vey.lucaris.phone.Phone;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private Phone[] phone;
    public static void main(String[] args) {
        //Phone phone = new Phone();
        Main main = new Main();

        main.showExceedTimeInCity();

        main.showUsedTalkOutCity();

        main.printAll();

    }

    public Main(){
        phone = new Phone[3];

        phone[0] = new Phone(1, "asdasd", "asdasdas", "sadasdas", 2131, 8.7, 5.6);
        phone[1] = new Phone();
    }

    public void showExceedTimeInCity(){
        final double timeIn = 7.0;
        System.out.println("1//////////////////////////////////////");
        for (Phone item: phone) {
            if (item.getTalkTimeInCity() > timeIn) {
                System.out.println(item.toString());
            }
        }
    }

    public void showUsedTalkOutCity(){
        System.out.println("2//////////////////////////////////////");
        for (Phone item: phone)
            if (item.getTalkTimeOutCity()>0.0)
                System.out.println();

    }

    public void printAll(){
        System.out.println("3//////////////////////////////////////");
        for (int i = 0; i< phone.length; i++)
            System.out.println(phone[i]);

    }
}