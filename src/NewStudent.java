import java.sql.SQLOutput;
public class NewStudent {
    String nome;
    double peso; //kg
    double altura; //metros

    public NewStudent(String nome , double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public void exibirStatus(){
        double imc = calcularIMC();
        System.out.println("Nome: " + nome);
        System.out.println("IMC: " + imc);

        if(imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25){
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}
