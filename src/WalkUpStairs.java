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
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                result[0] = stairs[0];
            } else if (i == 1) {
                result[1] = result[0] + stairs[1];
            } else if (i == 2) {
                result[i] = Math.max(stairs[i-1], stairs[i-2]) + stairs[i];
            } else {
                if (Math.max(result[i-2], result[i-3]) == result[i-2]) {
                    result[i] = result[i-2] + stairs[i];
                } else {
                    result[i] = Math.max(result[i-1], result[i-2]) + stairs[i];
                }
            }

            System.out.println("result[" + i + "] = " + result[i]);
        }

        System.out.println(result[result.length - 1]);
    }
}
