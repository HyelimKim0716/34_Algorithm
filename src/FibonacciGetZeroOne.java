import java.util.Scanner;

public class FibonacciGetZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] input = new int[t];
        for (int i = 0; i < input.length; i++) {
//            Scanner sc1 = new Scanner(System.in);
            input[i] = sc.nextInt();
        }

        int[][] result = new int[t][2];
        for (int i = 0; i < t; i++) {
            if (input[i] == 0) {
                result[i][0] = 1;
                result[i][1] = 0;
                System.out.println(result[i][0] + " " + result[i][1]);
                continue;
            } else if (input[i] == 1) {
                result[i][0] = 0;
                result[i][1] = 1;
                System.out.println(result[i][0] + " " + result[i][1]);
                continue;
            }

            // input[i] == 5
            // result[i][0] = result[i-1][0] + result[i-2][0]
            // result[5][0] = result[4][0] + result[3][0]
            // result[4][0] = result[3][0] + result[2][0]
            // result[3][0] = result[2][0] + result[1][0]
            // result[2][0] = result[1][0] + result[0][0]
            int[][] temp = new int[input[i] + 1][2];
            temp[0][0] = 1;
            temp[0][1] = 0;
            temp[1][0] = 0;
            temp[1][1] = 1;

            for (int j = 2; j < temp.length; j++) {
                temp[j][0] = temp[j-1][0] + temp[j-2][0];
                temp[j][1] = temp[j-1][1] + temp[j-2][1];
                System.out.println(temp[j][0] + " " + temp[j][1]);
            }

            result[i][0] = temp[temp.length - 1][0];
            result[i][1] = temp[temp.length - 1][1];
            System.out.println("result " + input[i] + " = " + temp[input[i]][0] + " " + temp[input[i]][1]);

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("result " + input[i] + " = " + result[i][0] + " " + result[i][1]);
        }
    }
}
