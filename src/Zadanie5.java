import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
    int numer=49;
        System.out.println("Liczby parzyste od 1 do " + numer + " :");
        for(int i=1;i<=numer;i++){
            if (i%2!=0){
                System.out.println(i+ "");
            }
        }
    }

}