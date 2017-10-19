import java.util.Scanner;

public class WalkUpStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] stairs = new int[count];
        for (int i = 0; i < count; i++) {
            stairs[i] = sc.nextInt();
        }

        // result[n] = max( 이전 계단을 밟지 않고 온 경우 || 이전 계단을 밟고 온 경우 )
        // result[n] = max( result[n-2] + stairs[n]|| result[n-3] + stairs[n] + stairs[n-1] )
        int[] result = new int[count];

        result[0] = stairs[0];
        result[1] = Math.max(stairs[0] + stairs[1], stairs[1]);
        result[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < count; i++) {
            result[i] = Math.max(result[i - 2] + stairs[i], result[i - 3] + stairs[i - 1] + stairs[i]);
        }

//        for (int i = result.length - 1; i >= 0; i--) {
//            System.out.println("result[" + i + "] = " + result[i]);
//        }

        // Result
        System.out.println(result[count - 1]);
    }
}
