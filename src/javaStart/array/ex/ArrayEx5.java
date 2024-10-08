// 문제와 풀이 1
// 문제 - 합계와 평균2
// 이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.

package javaStart.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        int total = 0;

        System.out.println(a + "개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) { // for (int i = 0; i < a; i++); 로 해도 된다.
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = (double) total / numbers.length; // numbers.length 말고 a로 바꿔도 된다.

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);

        scanner.close();
    }
}
