import java.util.*;

/**
 여러 개의 자연수를 표준 입력(standard input)에서 읽은 후, 그 수들을 이어 붙여서 만들 수 있는 가장 큰 수와 가장 작은 수의 합을 구하세요.



 [입력]

 주어지는 입력은 10개 이하이며, 각각의 숫자는 2자리 이하의 자연수입니다.
 숫자는 공백으로 구분됩니다.
 두 번째 예시에 대해 주의 깊게 살펴보시기 바랍니다.

 [출력]
 올바른 출력은 하나의 문장이어야 하며, 문장의 마지막은 불필요한 공백 없이 개행 문자(newline, \n)로 끝나야 합니다.


 [예시 설명 (1)]

 입력이 1 2 3일 경우, 만들 수 있는 가장 큰 수는 321이고 가장 작은 수는 123이며 두 수의 합은 444이다.
 따라서 결과는 다음과 같다.
 444


 [예시 설명 (2)]

 입력이 2 9 10 21 24일 경우,
 만들 수 있는 가장 큰 수는 92422110이고, 가장 작은 수는 10212249이며 두 수의 합은 102634359
 따라서 결과는 다음과 같다.
 102634359


 입/출력 예시
 ⋇ 입출력 형식을 잘 지켜주세요.
 ␣ : 공백↵ : 줄바꿈


 보기 입력 1
 1 ␣2 ␣3
 1 2 3
 출력 1
 444↵


 보기 입력 2
 2 ␣9 ␣10 ␣21 ␣24
 2 9 10 21 24
 출력 2
 102634359↵
 102634359

 * */

public class ConnectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        String[] input = inputStr.split(" ");
        Arrays.sort(input);

        System.out.println(Arrays.toString(input));

        for (String one : input) {
            System.out.print(one + " ");
        }

        String[] resultMin = new String[input.length];

//        int[] oneIndex = new int[input.length];
//        int indexOne = 0;
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input[i] + ", input["+i+"].length = " + input[i].length());
//            if (input[i].length() == 1) {
//                oneIndex[indexOne] = i;
//            }
//        }

        System.out.println();
//        System.out.println("oneIndex = " + oneIndex);

        int index = 0;
        String temp = "";

        for (int i = 0; i < input.length; i++) {
            System.out.println("input[" + i + "] = " + input[i] + ", length = " + input[i].length());
            if (input[i].length() == 1) {

                System.out.println("temp = " + temp + ", length = " + temp.length());
                if (temp.length() > 0) {
                    resultMin[index] = temp;
                    System.out.println("temp = " + temp + ", resultMin[index] = " + resultMin[index]);
                    temp = input[i];
                    index++;
                } else {
                    temp = input[i];
                }
            } else {
                resultMin[index] = input[i];
                index++;
            }

            if (i == input.length -1 && temp.length() > 0) {
                resultMin[index] = temp;
            }
        }

        System.out.println("===============");
        StringBuilder min = new StringBuilder();
        for (String one : resultMin) {
            System.out.println(one);
            min.append(one);
        }
        int minNum = Integer.parseInt(min.toString());

        List<String> tempList = Arrays.asList(resultMin);
        Collections.reverse(tempList);
        String[] resultMax = tempList.toArray(new String[tempList.size()]);
        StringBuilder max = new StringBuilder();
        for (String one : resultMax) {
            System.out.print(one + " ");
            max.append(one);
        }
        int maxNum = Integer.parseInt(max.toString());

        System.out.println("answer = " + (minNum + maxNum));

    }


}