import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        Scanner leitorEntradas = new Scanner(System.in);
        float valorSalario = leitorEntradas.nextFloat();
        float valorBeneficios = leitorEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
        }

        if (valorSalario >= 1100.01 && valorSalario <= 2500.00){
            valorImposto = 0.10F * valorSalario;
        }
        
        if (valorSalario > 2500.00){
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
