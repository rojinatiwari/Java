
import java.util.*;

class sum {
    public static void main(String[] args) {
        count c = new count();
        c.setData();
        int res = c.sumEvenDigit();
        System.out.println("Sum of square of even digits =" + res);
    }

}

class count {
    private int num;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        sc.close();
    }

    public int sumEvenDigit() {

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int ext = temp % 10;
            if (ext % 2 == 0) {
                sum = sum + ext * ext;

            }

            temp = temp / 10;
        }
        return sum;
    }

}
