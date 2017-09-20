import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();

        int[][] input = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input " + (i + 1) + " : ");
            for (int j = 0; j < i + 1; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("Input[" + i + "][" + j + "] = " + input[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result = new int[n][n];
        result[0][0] = input[0][0];
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
//                System.out.println("j-1 = " + (j-1) + ", j+1 = " + (j+1) + ", input[i-1].length = " + input[i-1].length);
//                if (j-1<0 && j+1 >= input[i-1].length) continue;
                if (j-1<0)
                    result[i][j] = result[i-1][j] + input[i][j];
//                    result[i][j] = result[i-1][j+1] + input[i][j];
//                else if (j+1>= input[i-1].length)
//                    result[i][j] = result[i-1][j-1] + input[i][j];
                else
                    result[i][j] = Math.max(result[i-1][j-1], result[i-1][j]) + input[i][j];

                System.out.print("result["+ i + "][" + j + "] = " + result[i][j] + " ");
            }
            System.out.println();
        }

        int answer = 0;
        for (int i = 0; i < result.length; i++) {
            if (answer < result[result.length-1][i]) answer = result[result.length-1][i];
        }

        System.out.println("answer = " +answer);
    }
}
