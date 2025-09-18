package UniversityDegree;

import java.util.Scanner;

public class UniversityDegree {
    public static int getDegree(String degree) {
        if (degree == null) throw new NullPointerException();

        return switch (degree) {
            case "phd" -> 3;
            case "bsc" -> 4;
            case "msc" -> 6;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int years = UniversityDegree.getDegree(input);
        System.out.printf("Input takes %d to complete", years);
    }
}
