import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz kwadrature, ktora chcesz policzyc- Wprowadz a,b,c lub d");
        System.out.println("a - Gauss-Chebyshev dla n=3");
        System.out.println("b - Gauss-Legendre dla n=4");
        System.out.println("c - Gauss-Laguerre dla n=3");
        System.out.println("d - Gauss-Hermite dla n=4");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        char wybrany;
        wybrany=sc.next().charAt(0);
        switch (wybrany) {
            case ('a') -> KwadraturyGaussa.kwadratura1();
            case ('b') -> KwadraturyGaussa.kwadratura2();
            case ('c') -> KwadraturyGaussa.kwadratura3();
            case ('d') -> KwadraturyGaussa.kwadratura4();
            default -> throw new IllegalStateException("Nieprawidlowa wartosc, wprowadz a,b,c lub d: " + wybrany);
        }
     
    }
}