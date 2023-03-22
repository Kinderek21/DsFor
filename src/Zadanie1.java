import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        int liczba;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz liczbe od 10 do 24");
        liczba = dane.nextInt();
        while ((liczba >= 10) && (liczba <= 24)) {
            System.out.println("Liczba jest poprawna");
            break;
        }
    }
}