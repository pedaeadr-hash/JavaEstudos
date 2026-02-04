public class Main {
    public static void main(String[] args) {

        String classe = "Pessoa";
        String nome = "Adrian Ariel Lopes Santos";
        String sexualidade = "Masculino";
        int idade = 15;
        String localidade = "São Paulo";
        double peso = 64;
        double altura = 1.70; // exemplo
        boolean empregadojava= false;
        if (empregadojava==true){

            System.out.println(
                    classe + " " + nome + " " + idade + " anos " + peso + " kg"
            );

            double imc = peso / (altura * altura);
            System.out.println("IMC de aproximadamente: " + imc + " "+ empregadojava);

        }
        else {
            System.out.println("Você nao trampa vaza fi");
        }

    }
}
