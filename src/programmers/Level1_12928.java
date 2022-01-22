package programmers;

/**
 * 타입    :연습문제
 * 제목    :약수의 합
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12928
 * date   : 2022-01-22
 * Description :정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */
public class Level1_12928 {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(12));
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if (n%i==0) {
                    answer += i;
                }
            }

            return answer;
        }
    }
}
