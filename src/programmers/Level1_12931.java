package programmers;

/**
 * 타입    :연습문제
 * 제목    :자릿수 더하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12931
 * date   : 2022-01-22
 * Description :자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class Level1_12931 {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(123));
        System.out.println(new Solution().solution2(123));
    }


    static class Solution {

        /**
         * String 으로 변환해서 자릿수를 확인하는 방법 (비효율적)
         */
        public int solution(int n) {
            int answer = 0;

            String str = String.valueOf(n);
            for (int i = 0; i < str.length(); i++) {
                answer += Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            return answer;
        }

        public int solution2(int n) {
            int answer = 0;
            while (n > 0) {
                answer += n%10;
                n = n/10;           // 원래  숫자의 단위수를 계속 줄여버림.
            }
            return answer;
        }
    }
}
