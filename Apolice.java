public class Apolice {
    public int numApolice;
    public String nomeSegurado;
    public int idade;
    public float valorPremio;
    public static int ultimoNumApolice = 0;
    
    public Apolice(){
        ultimoNumApolice++;
        this.numApolice = ultimoNumApolice;
    }
    public Apolice(String nomeSegurado, int idade, float valorPremio){
        ultimoNumApolice++;
        this.numApolice = ultimoNumApolice;
        this.nomeSegurado = nomeSegurado;
        this.valorPremio = valorPremio;
    }
    public void imprimir(){
        System.out.println("----------------------------------");
        System.out.println(this.numApolice);
        System.out.println(this.nomeSegurado);
        System.out.println(this.idade);
        System.out.println(this.valorPremio);
        System.out.println("---------------------------------");
    }
    public void calcularPremio(){
        if(idade >= 18 && idade <= 25){
            this.valorPremio = (float) (this.valorPremio * 1.20);
        }else if(idade > 25 && idade <= 36){
            this.valorPremio = (float) (this.valorPremio * 1.15);
        }else if(idade > 36){
            this.valorPremio = (float) (this.valorPremio * 1.10);
        }
    }
    public float oferecerDesconto(String cidade){
        switch (cidade) {
            case "Florianópolis" -> {
                return (float) (this.valorPremio * 0.05);
            }
            case "Chapecó" -> {
                return (float) (this.valorPremio * 0.06);
            }
            case "Joaçaba" -> {
                return (float) (this.valorPremio * 0.07);
            }
            case "Joinville" -> {
                return (float) (this.valorPremio * 0.08);
            }
            default -> {
            }
        }
        return 0;
    }
    public static void exibeUltimoNum(){
        System.out.println(ultimoNumApolice);
    }
    
}
