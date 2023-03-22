import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        String liczba;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz Tak lub Nie ");
        liczba = dane.nextLine();
        while (liczba.equals("Tak")){
            System.out.println("Poprawne");
            break;
        }
        while (liczba.equals("Nie")){
            System.out.println("Poprawne");
            break;
        }
    }
}