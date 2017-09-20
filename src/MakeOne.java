public class MakeOne {

    public static void main(String args[]) {
        int count = 0;
        int value = 13;

        while(value == 1) {
            if (value % 3 == 0) {
                value /= 3;
                count++;
            }

            if (value %2 ==0) {
                value /= 2;
                count++;
            }

            if (value % 3 !=0 || value %2 != 0) {
                value--;
                count++;
            }

            System.out.println("value = " + value);
        }

    }
}
