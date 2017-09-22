import java.util.Scanner;

public class FibonacciGetZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] input = new int[t];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int[][] result = new int[t][2];
            if (input[i] == 0) {
                result[i][0] = 1;
                result[i][1] = 0;
                System.out.println(result[0][0] + " " + result[0][1]);
                continue;
            } else if (input[i] == 1) {
                result[i][0] = 0;
                result[i][1] = 1;
                System.out.println(result[i][0] + " " + result[i][1]);
                continue;
            }

            result[0][0] = 1;
            result[0][1] = 0;
            result[1][0] = 0;
            result[1][1] = 1;

            for (int j = 2; j <= input[i]; j++) {
                result[j][0] = result[j-1][0] + result[j-2][0];
                result[j][1] = result[j-1][1] + result[j-2][1];
                System.out.println(result[j][0] + " " + result[j][1]);
            }

            System.out.println("result " + input[i] + " = " + result[input[i]][0] + " " + result[input[i]][1]);

        }

//        System.out.println("=============");
//        for (int i = 0; i < input[i]; i++) {
//            System.out.println("result " + input[i] + " = " + result[input[i]][0] + " " + result[input[i]][1]);
//        }
    }
}
