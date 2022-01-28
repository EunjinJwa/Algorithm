package programmers;

/**
 * 타입    :연습문제
 * 제목    :소수 찾기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12921
 * date   : 2022-01-25
 * Description :
 */
public class Level1_12921 {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(5));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 2; i <= n; i++) {
                boolean isSingleNum = false;
                for (int k = 2; k <= i/2; k++) {
                    if (i%k == 0) {
                        isSingleNum = true;
                        break;
                    }
                }
                if (isSingleNum) answer++;
            }
            return answer;
        }
    }
}
