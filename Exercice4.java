import java.util.Scanner;
class Exercice4 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
        
        System.out.println("Les " + n + " premiers termes du pas croissant:");
        for (int i=1; i<=n; i++) {
            num = (i + (i-1));
            System.out.println(num);
        };             
    }
}