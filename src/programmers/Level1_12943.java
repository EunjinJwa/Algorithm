package programmers;

/**
 * 타입    :연습문제
 * 제목    : 콜라츠 추
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12943
 * date   : 2022-01-25
 * Description :
 */
public class Level1_12943 {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(626331));
    }

    static class Solution {
        public int solution(int number) {
            int answer = 0;
            long num = number;
            while (num != 1 && answer < 500) {
                answer++;
                if (num%2==0) {
                    num = num/2;
                } else {
                    num = (num * 3) + 1;
                }
            }
            System.out.println(answer + " / " + num);
            return answer >= 500 ? -1 : answer;
        }
    }

}
