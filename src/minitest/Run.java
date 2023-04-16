package minitest;

import java.util.List;
import java.util.Scanner;

public class Run {
    public static List<Contact> contacts = ReadFile.readFile();
     private static PhoneBookManage phoneBookManage = new PhoneBookManage();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = -1;
        while (choise != 0) {
            System.out.println("MENU ---------------");
            System.out.println(" 1. Insert a contact.\n" +
                    " 2. Sort by name.\n" +
                    " 3.  Display by type.\n" +
                    " 4.  Search by name.\n" +
                    " 5.  Delete a contact.\n" +
                    " 6.  Update contacts.\n" +
                    " 0.  Exit...");
            System.out.println(" Please select function: ");
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1: {
                    System.out.println(" Enter a name: ");
                    String name = scanner.nextLine();
                    System.out.println(" Enter phone number: ");
                    String phone = scanner.nextLine();
                    System.out.println(" Enter ID ");
                    String id = scanner.nextLine();
                    System.out.println(" Enter a name: ");
                    String name1 = scanner.nextLine();
                    Type type = new Type(id,name1);
                    Contact contact = new Contact(name,phone, (java.lang.reflect.Type) type);
                    phoneBookManage.insertPhone(contact);
                    System.out.println(" Done insert...");
                }
                case 2:{
                    System.out.println(" Contact...");
                    phoneBookManage.sort();
                    break;}
                case 3:{
                    System.out.println(" Enter id: ");
                    String id = scanner.nextLine();
                    System.out.println(" Enter name: ");
                    String name = scanner.nextLine();
                    phoneBookManage.removePhone(name);
                    break;}
                case 4:{
                    System.out.println(" Please enter the search term...");
                    String name = scanner.nextLine();
                    phoneBookManage.searchPhone(name);
                    break;}
                case 5:{
                    System.out.println(" Please enter the name to delete: ");
                    String name = scanner.nextLine();
                    phoneBookManage.removePhone(name);
                    break;}
                case 6:{
                    System.out.println( "Please enter the name");
                    String name = scanner.nextLine();
                    System.out.println( "Please enter telephone number");
                    String phone = scanner.nextLine();
                    phoneBookManage.updatePhone(name,phone);
                    break;}
                default:
                    System.out.println(" Please choose the correct function number sequence above!");
            }
        }
    }
}
