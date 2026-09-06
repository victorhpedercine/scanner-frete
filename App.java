import java.util.Scanner;

public class App {
    public static final double valorMinimoFreteGratis = 150.00;
    public static final double valorFixoFrete = 15.00;

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();
        if (valorCompra >= valorMinimoFreteGratis) {
            System.out.println("O frete é grátis!");
        } else {
            System.out.println("O valor do frete é: R$ " + valorFixoFrete);
        }
        double valorTotal = valorCompra + (valorCompra >= valorMinimoFreteGratis ? 0 : valorFixoFrete);
        System.out.println("O valor total da compra é: R$ " + valorTotal);
        entrada.close();
    }
}
