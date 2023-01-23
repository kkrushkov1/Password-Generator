import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());

        String lower_cases = "qwertyuuiopasdfghjklzxcvbnm";
        String upper_cases = lower_cases.toUpperCase();
        String specialSymbols = "!@#$%&*?£";
        String numbers = "123456789";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < digit; i++) {
            int random = (int) (4 * Math.random());

            switch (random) {
                case 0:
                    password.append((int) (numbers.length() * Math.random()));
                    break;
                case 1:
                    random = (int) (lower_cases.length() * Math.random());
                    password.append(lower_cases.charAt(random));
                    break;
                case 2:
                    random = (int) (upper_cases.length() * Math.random());
                    password.append(upper_cases.charAt(random));
                    break;
                case 3:
                    random = (int) (specialSymbols.length() * Math.random());
                    password.append(specialSymbols.charAt(random));
                    break;
            }
        }
        System.out.println(password);
    }
}