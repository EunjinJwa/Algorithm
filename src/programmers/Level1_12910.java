package programmers;

import java.util.Arrays;

/**
 * 타입    :연습문제
 * 제목    :나누어 떨어지는 숫자 배열
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12910
 * date   : 2022-01-25
 * Description :
 */
public class Level1_12910 {


    public static void main(String[] args) {

        int[] arr = {4,9,7,11};
        int divisor = 5;
        System.out.println(Arrays.toString(new Solution().solution(arr, divisor)));
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = Arrays.stream(arr).filter(n -> n%divisor == 0).sorted().toArray();
            if (answer.length == 0) {
                return new int[]{-1};
            }
            return answer;
        }
    }
}
