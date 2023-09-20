import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80 ) {
            System.out.println("good");
        } else if (marks > 70 ) {
            System.out.println("fair");
        } else if (marks > 60 ) {
            System.out.println("meets expectation");
        } else if (marks >= 0 ) {
            System.out.println("belo par");
        } else {
            System.out.println("inproper marks");
        }
    }
}
