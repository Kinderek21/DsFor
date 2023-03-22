import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        String imie;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz imie");
        imie = dane.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(imie);
        }
    }
}