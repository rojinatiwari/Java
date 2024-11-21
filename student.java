
import java.util.*;

class student {
    public static void main(String[] args) {
        Result r = new Result();
        r.setDetail();
        r.displayDetail();
    }

}

class Result {
    private double s1, s2, s3;
    private int roll;
    private String name;

    public void setDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter roll");
        roll = sc.nextInt();
        System.out.println("Enter marks in three subjects");
        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        s3 = sc.nextDouble();
        sc.close();
    }

    public void displayDetail() {
        double total = s1 + s2 + s3;
        double pct = total / 3;

        String div;
        if (pct >= 80) {
            div = "Distinction";
        } else if (pct >= 60) {
            div = "First Division";
        } else if (pct >= 50) {
            div = "Second Division";
        } else if (pct >= 40) {
            div = "Third Division";
        } else {
            div = "Fail";
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + s1 + ", " + s2 + ", " + s3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + pct + "%");
        System.out.println("Division: " + div);

    }

}
