import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("name :");
        String name = sc.nextLine();
        System.out.println("address :");
        String adr = sc.nextLine();
        System.out.println("do you want to continue? (y/n)");
        String type = sc.nextLine();
        while (type.equals("y")) {
            System.out.println("name :");
            String name = sc.nextLine();
            System.out.println("address :");
            String adr = sc.nextLine();
        }
    }
}