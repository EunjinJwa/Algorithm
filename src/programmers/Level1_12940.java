package programmers;

import java.util.Arrays;

/**
 * 타입    :연습문제
 * 제목    :최대공약수(GCD)와 최소공배수(LCM)
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12940
 * date   : 2022-01-22
 * Description :
 *
 * 최대공약수와 최소공배수의 개념부터 다시 봄....
 */
public class Level1_12940 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6,12)[0]);
        System.out.println(solution.solution(15,20)[1]);
    }

    static class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];

            answer[0] = getGcd(n, m);
            answer[1] = getLcm(n, m);
            return answer;
        }

        /**
         * 최대공약수 구하기
         */
        public int getGcd(int n, int m) {
            int minNum = Math.min(n, m);
            // 최대공약수
            for (int i = minNum; i >= 2; i--) {
                if (n%i == 0 && m%i == 0) {
                    return i;
                }
            }
            return 1;
        }

        /**
         * 최소공배수 구하기
         */
        public int getLcm(int n, int m) {
            int gcd = getGcd(n, m);
            return n/gcd * m/gcd * gcd;
        }
    }



}
