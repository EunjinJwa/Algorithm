package programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 타입    :
 * 제목    :직사각형 별찍기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12969
 * date   : 2022-01-08
 * Description :  간단한 거라도, 쌈박하게 구현하는 방법은 있다...
 * for 보다 IntStream 사용이 멋있네
 */
public class Level1_12969 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int s = 0; s < a; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 다른 풀이 --- 쌈박하다
        System.out.println("==========================================");
        StringBuilder output = new StringBuilder();
        IntStream.range(0, a).forEach(i -> output.append("*"));
        IntStream.range(0, b).forEach(i -> System.out.println(output.toString()));

    }


}
