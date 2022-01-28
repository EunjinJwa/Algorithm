package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 타입    :연습문제
 * 제목    :제일 작은 수 제거하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12935
 * date   : 2022-01-25
 * Description :
 */
public class Level1_12935 {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1}; 
        System.out.println(Arrays.toString(new Solution().solution(arr)));
    }

    static class Solution {
        public int[] solution(int[] arr) {

            List<Integer> resultList = new ArrayList<>();
            int minNum = Arrays.stream(arr).min().getAsInt();
            for (int num : arr) {
                if (num > minNum) {
                    resultList.add(num);
                }
            }
            if (resultList.isEmpty()) {
                resultList.add(-1);
            }

            int[] answer = new int[resultList.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = resultList.get(i);
            }
            return answer;
        }
    }
}
