import java.util.Random;
import java.lang.*;

public class Main {
    public static int generateRandomNumber(int n){
        int i = new Random().nextInt(n); //это кидалка случайных чисел!)
        return i;
     }
    public static String binary (int n) {
        String binary = Integer.toBinaryString(n);
        return binary;
    }
    public static int HighestOneBit (int a) {
        System.out.println("Number is = " + a);
        System.out.print("Highest one bit of the given integer is = ");
        return Integer.highestOneBit(a);
    }
    public static int[] krat_Array (int highest_bit, int random_number, int max_value) {   // не знаю как с массивом
//        int[] tmp;
        int count = 0;
        for (int j = random_number; j < max_value + 1; j++) {
            if (j % highest_bit == 0) {
                count = count + 1;
            }
        }
        System.out.println(count + " - size of array");
        int[] m1 = new int [count];
        for (int j = random_number; j < max_value + 1; j++) {
            int counter = 0;
            if (j % highest_bit == 0) {
                m1[counter] = m1[j];
                counter = counter + 1;
            }
        }
        return m1;
    }
    public static void main(String[] args){
        int n = 2000 + 1;
        int random_num = generateRandomNumber(n); // i - случайное число
        System.out.println(random_num + " - i случайное число");
        String bin = binary(random_num);
        System.out.println(bin + " - это битовый код");
        int highBit = HighestOneBit(random_num); // n номер старшего бита
        System.out.println(highBit + " - n - номер старшего бита");
        short high = Short.MAX_VALUE;
        System.out.println(high + " - short.MAX_VALUE");
        //------- тут про массив -----------//
      int[] kratniy = krat_Array(highBit, random_num, high);
      System.out.println(kratniy);
      System.out.println(kratniy.length + " - длина массива - ");

    }
}
