import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        int liczba,sum=0;
        Scanner dane = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Wprowadz liczbe");
            liczba = dane.nextInt();
            sum+=liczba;
            System.out.println("Suma wynosi : "+ sum);

        }

    }
}