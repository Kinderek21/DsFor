import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){
        int liczba1;
        Scanner dane = new Scanner(System.in);
        int liczba2;
        String a;
        do {
            System.out.println("Wprowadz liczba1");
            liczba1 = dane.nextInt();
            System.out.println("Wprowadz liczbe2");
            liczba2 = dane.nextInt();
            int suma= liczba1+liczba2;
            System.out.println("Suma : " + suma);
            System.out.println("Czy chcesz kontynuowac ? ");
            a = dane.next();
        }while (a.equals("tak"));
        return;
    }
}