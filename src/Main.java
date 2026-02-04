public class Main {
    public static void main(String[] args) {

        String category = "People";
        String name = "Adrian Ariel Lopes Santos";
        String gender = "Male";
        int age = 15;
        String location = "São Paulo";
        double weight = 64;
        double height = 1.70; // example
        boolean employedInJava = true;

        if (employedInJava) {

            System.out.println(
                    category + " " + name + " " + age + " years " + weight + " kg"
            );

            double bmi = weight / (height * height);
            System.out.println("Approximate BMI: " + bmi + " " + employedInJava);

        } else {
            System.out.println("Denied");
        }
    }
}
