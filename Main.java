import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String cidade;
        Scanner scan = new Scanner(System.in);
        Apolice apolice1 = new Apolice();
        cidade = scan.nextLine();
        apolice1.nomeSegurado = scan.nextLine();
        apolice1.idade = scan.nextInt();
        apolice1.valorPremio = scan.nextFloat();
        apolice1.calcularPremio();
        apolice1.imprimir();
        float desconto = apolice1.oferecerDesconto(cidade);
        System.out.println(desconto);
        Apolice apolice2 = new Apolice("Joao", 18, 1500);
        apolice2.calcularPremio();
        apolice2.imprimir();
        float desconto2 = apolice2.oferecerDesconto("Joaçaba");
        System.out.println(desconto2);
        System.out.println(Apolice.ultimoNumApolice);
    }
}
