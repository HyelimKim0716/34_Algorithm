import java.util.Scanner;

public class TasteWine {

    // https://www.acmicpc.net/problem/2156
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] wines = new int[count];
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            wines[i] = sc.nextInt();
        }

        result[0] = wines[0];
        result[1] = wines[0] + wines[1];
        result[2] = Math.max(wines[0] + wines[2], wines[1] + wines[2]);

        for (int i = 3; i < count; i++) {
            result[i] = Math.max(result[i - 3] + wines[i - 1] + wines[i], result[i - 2] + wines[i]);
        }

        System.out.println(Math.max(result[count - 1], result[count - 2]));
    }
}
