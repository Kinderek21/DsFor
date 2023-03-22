import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        String liczba;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz T,t,N,n");
        liczba = dane.nextLine();
        while (liczba.equals("T")){
            System.out.println("Poprawne");
            break;
        }
        while (liczba.equals("t")){
            System.out.println("Poprawne");
            break;
        }
        while (liczba.equals("N")){
            System.out.println("Poprawne");
            break;
        }
        while (liczba.equals("n")){
            System.out.println("Poprawne");
            break;
        }
    }
}