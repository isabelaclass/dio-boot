import java.util.Locale;
import java.util.Scanner;


public class BancoApp {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros/100, periodo);

        System.out.println(String.format("Valor final do investimento: R$ %.2f", valorFinal));
        
        scanner.close();
    }
}