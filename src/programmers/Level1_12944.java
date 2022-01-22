package programmers;

import java.util.Arrays;

/**
 * 타입    :연습문제
 * 제목    :평균 구하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12944
 * date   : 2022-01-22
 * Description :정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class Level1_12944 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(new Solution().solution(arr));
        System.out.println(new Solution().solution2(arr));

        System.out.println("Sum = " + Arrays.stream(arr).sum());
    }

    static class Solution {
        public double solution(int[] arr) {
            long sumAmount = 0;
            // sumAmount = Arrays.asList().stream().mapToLong(i -> Long.parseLong((String) i)).sum();
            for (int num : arr) {
                sumAmount += num;
            }
            System.out.println("sum = " + sumAmount);
            return (double) sumAmount/arr.length;
        }

        public double solution2(int[] arr) {
            return Arrays.stream(arr).average().getAsDouble();
        }
    }
}
