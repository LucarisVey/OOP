package git.vey.lucaris.phone;
import git.vey.lucaris.Main;

import java.util.Scanner;

public class Phone {
    private int id;
    private String lastName;
    private String firstName;
    private String surname;
    private long accountNumber;
    private double talkTimeInCity;
    private double talkTimeOutCity;

    public Phone (){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user's * id:");
        id = s.nextInt();
        s.nextLine();
        System.out.println("Enter user's last name:");
        lastName = s.nextLine();
        System.out.println("Enter user's first name:");
        firstName = s.nextLine();
        System.out.println("Enter user's surname:");
        surname = s.nextLine();
        System.out.println("Enter user's account number:");
        accountNumber = s.nextLong();
        System.out.println("Enter user's talk time in city:");
        talkTimeInCity = s.nextDouble();
        System.out.println("Enter user's talk time out city:");
        talkTimeOutCity = s.nextDouble();
    }

    public Phone (int _id, String _lastName, String _firstName,
                  String _surname, long _accountNumber,
                  double _talkTimeInCity, double _talkTimeOutCity){
        id = _id;
        lastName = _lastName;
        firstName = _firstName;
        surname = _surname;
        accountNumber = _accountNumber;
        talkTimeInCity = _talkTimeInCity;
        talkTimeOutCity = _talkTimeOutCity;
    }

    public int getId(){
        return this.id;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getSurname() {
        return surname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }


    public double getTalkTimeInCity() {
        return talkTimeInCity;
    }


    public double getTalkTimeOutCity() {
        return talkTimeOutCity;
    }


    public String toString(){
        return "Phone {" + "id = " + id + ", last name = " + lastName +
                ", first name = " + firstName +  ", surname = " + surname +
                ", account number = " + accountNumber +  ", talk time in the city = " +
                talkTimeInCity +  ", talk time out the city = " + talkTimeOutCity + "}";
    }

}
