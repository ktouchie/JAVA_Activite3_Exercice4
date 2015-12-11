import java.util.Scanner;
class Exercice4 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
        
        int num = 1;
        int num2 = 1;
        int a = 0;
        int b = 1;
        
        System.out.println("Les " + n + " premiers termes du pas croissant:");
        for (int i=1; i<=n; i++) {
            num = (num + (i-1));
            System.out.println(num);
        };

        System.out.println("Les " + n + " premiers termes de la boiteuse:");
        for (int i=1; i<=n; i++) {
            System.out.println(num2);
            if (i%2==1) {
                num2 = (num2+1);
            } else {
                num2 = (num2+2);
            };
        }
        
        System.out.println("Les " + n + "premiers termes de la suite de Fibonacci:");
        if (n==1) {
            System.out.println(0);
        } else if (n==2) {
            System.out.println(0);
            System.out.println(1);
        } else {
            System.out.println(0);
            System.out.println(1);
            for (int i=3; i<=n; i++) {
                int c = (a + b);
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}