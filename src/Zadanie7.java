import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
        int liczba,sum=0;
        Scanner dane = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.println("Wprowadz liczbe");
            liczba = dane.nextInt();
            sum+=liczba;
        }
        System.out.println("Suma wynosi : "+ sum);
    }
}