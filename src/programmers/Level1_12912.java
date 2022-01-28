package programmers;

public class Level1_12912 {


    /**
     * 타입    :연습문제
     * 제목    :두 정수 사이의 합
     * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12912
     * date   : 2022-01-25
     * Description :
     */
    public static void main(String[] args) {

        System.out.println(new Solution().solution(5,3));
    }

    static class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            if (a == b) return a;
            long min = Math.min(a,b);
            long max = Math.max(a,b);
            answer = (max+1)*max/2 - (min * (min-1)/2);
            return answer;
        }
    }
}
