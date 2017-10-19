import java.util.Scanner;

public class WalkUpStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] stairs = new int[count];
        for (int i = 0; i < count; i++) {
            stairs[i] = sc.nextInt();
        }

        int[] result = new int[count];

        if (count == 1) {
            System.out.println(stairs[0]);
            return;
        }

        if (count == 2) {
            System.out.println(stairs[0] + stairs[1]);
            return;
        }

        if (count == 3) {
            if (stairs[0] > stairs[1])
                System.out.println(stairs[0] + stairs[2]);
            else
                System.out.println(stairs[1] + stairs[2]);

            return;
        }

        result[count - 1] = stairs[count - 1];

        for (int i = count - 1; i >= 2; i--) {
            if (result[i] == 0)
                continue;

            if (stairs[i - 1] > stairs[i - 2]) {
                result[i - 1] = stairs[i - 1] + result[i];
                result[i - 2] = 0;
            } else {
                result[i - 2] = stairs[i - 2] + result[i];
                result[i - 1] = 0;
            }

//            System.out.println("result[" + i + "] = " + result[i]);
        }

        if (result[2] == 0) {
            result[1] = result[3] + stairs[1];
            result[0] = result[1] + stairs[0];
        } else {
            if (result[1] > result[0]) {
                result[1] = result[2] + stairs[1];
                result[0] = 0;
            } else {
                result[0] = result[2] + stairs[0];
                result[1] = 0;
            }
        }

//        for (int i = result.length - 1; i >= 0; i--) {
//            System.out.println("result[" + i + "] = " + result[i]);
//        }

        // Result
        System.out.println(Math.max(result[0], result[1]));
    }
}
