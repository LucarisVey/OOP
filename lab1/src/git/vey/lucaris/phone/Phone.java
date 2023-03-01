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

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTalkTimeInCity() {
        return talkTimeInCity;
    }

    public void setTalkTimeInCity(double talkTimeInCity) {
        this.talkTimeInCity = talkTimeInCity;
    }

    public double getTalkTimeOutCity() {
        return talkTimeOutCity;
    }

    public void setTalkTimeOutCity(double talkTimeOutCity) {
        this.talkTimeOutCity = talkTimeOutCity;
    }
    /*public void setValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user's id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        this.setId(id);
        System.out.println("Enter user's last name:");
        String lastName = scanner.nextLine();
        scanner.nextLine();
        this.setLastName(lastName);
        System.out.println("Enter user's first name:");
        String firstName = scanner.nextLine();
        scanner.nextLine();
        this.setFirstName(firstName);
        System.out.println("Enter user's surname:");
        String surname = scanner.nextLine();
        scanner.nextLine();
        this.setSurname(surname);
        System.out.println("Enter user's account number:");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();
        this.setAccountNumber(accountNumber);
        System.out.println("Enter user's talk time in the city:");
        double talkTimeInCity = scanner.nextDouble();
        scanner.nextLine();
        this.setTalkTimeInCity(talkTimeInCity);
        System.out.println("Enter user's talk time out the city:");
        double talkTimeOutCity = scanner.nextDouble();
        scanner.nextLine();
        this.setTalkTimeOutCity(talkTimeOutCity);

    }*/

    public String toString(){
        return "Phone {" + "id = " + id + ", last name = " + lastName +
                ", first name = " + firstName +  ", surname = " + surname +
                ", account number = " + accountNumber +  ", talk time in the city = " +
                talkTimeInCity +  ", talk time out the city = " + talkTimeOutCity + "}";
    }

}
