package programmers;

import java.util.Arrays;

/**
 * 타입    :
 * 제목    :x만큼 간격이 있는 n개의 숫자
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12954
 * date   : 2022-01-08
 * Description :
 */
public class Level1_12954 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(-2 ,2)));

    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        int idx = 0;
        for (long i = 0; i < n; i++) {
            answer[idx++] = x * (i+1);
        }
        return answer;
    }
}
