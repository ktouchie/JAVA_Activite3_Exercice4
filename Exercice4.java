import java.util.Scanner;
class Exercice4 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
        
        System.out.println("Le pas croissant jusqu'a " + n + ":");
        for (int i=1; i<=n; i++) {
            System.out.println(i+(i-1));
        };             
    }
}