import java.util.Scanner;

public class aritmetikIslem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz : ");
        int a = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        int b = scanner.nextInt();

        System.out.println("Üçüncü sayıyı giriniz : ");
        int c = scanner.nextInt();

        int islem = a+b*c-b;

        System.out.println(islem);


    }

}
