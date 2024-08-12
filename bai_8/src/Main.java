import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc= new Scanner(System.in);
        String answer;
        do {
            System.out.println("nhap số nguyên n: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("bạn có muốn nhập thêm số không? (y/n)");
            answer = sc.nextLine();
            sum= sum + n;
        } while ( answer.equals("y") );
        System.out.println("tong cac so n la: " + sum);
    }
}