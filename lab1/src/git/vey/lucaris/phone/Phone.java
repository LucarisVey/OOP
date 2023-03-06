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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user's * id:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter user's last name:");
        lastName = scanner.nextLine();
        System.out.println("Enter user's first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter user's surname:");
        surname = scanner.nextLine();
        System.out.println("Enter user's account number:");
        accountNumber = scanner.nextLong();
        System.out.println("Enter user's talk time in city:");
        talkTimeInCity = scanner.nextDouble();
        System.out.println("Enter user's talk time out city:");
        talkTimeOutCity = scanner.nextDouble();
    }

    public Phone (int id, String lastName, String firstName,
                  String surname, long accountNumber,
                  double talkTimeInCity, double talkTimeOutCity){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.talkTimeInCity = talkTimeInCity;
        this.talkTimeOutCity = talkTimeOutCity;
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
