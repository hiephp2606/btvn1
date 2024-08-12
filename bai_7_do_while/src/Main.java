import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap so n: ");
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        int sum =0;
        int mul =1;
        int sumeven =0;
        int i=1;

//      do_while
        System.out.println("su dung vong do while \n");
        do {
            sum = sum + i;
            mul = mul * i;
            if (i % 2 == 0) {
                sumeven = sumeven + i;
            }
            i++;
        }while (i <= n);
        System.out.println("tong so nguyen den n: " + sum);
        System.out.println("tich so nguyen den n: " + mul);
        System.out.println("tong so nguyen chan den n: " + sumeven);

    }
}