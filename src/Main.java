import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);

        System.out.println("HI WELCOME TO AZURE");
        System.out.println("YOUR SOLUTIONS PROGRAM");

        System.out.println("whats your name ?");
        String name = st.nextLine();

        System.out.println("OK " + name + " whats your age ?");
        int age = st.nextInt();
        st.nextLine();

        System.out.println("OK you there is " + age + " age");

        System.out.println("mandar para a lista digite yes or no :");
        String afirma = st.nextLine();

        if (afirma.equalsIgnoreCase("yes")) {
            System.out.println("mandando informaçoes para a lista");
            Lista.listap(name, age); // 👈 AQUI A MÁGICA
        } else {
            System.out.println("ok vc nao quer enviar");
        }
    }
}
