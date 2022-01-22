package programmers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 타입    :월간코드챌린지 시즌1
 * 제목    :두 개 뽑아서 더하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/68644
 * date   : 2022-01-22
 * Description :정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 */
public class Level1_68644 {
    public static void main(String[] args) {

        int[] numbers = {5,0,2,7};
        System.out.println(Arrays.toString(new Solution().solution(numbers)));
    }

    static class Solution {
        public int[] solution(int[] numbers) {

            Set<Integer> sets = new HashSet<>();

            for (int i = 0; i < numbers.length-1; i++) {
                int idx = i+1;
                while (idx < numbers.length) {
                    sets.add(numbers[i] + numbers[idx]);
                    idx++;
                }
            }
            int[] answer = new int[sets.size()];

            /**
             * sort 하는 방법 1 - set 을 stream을 사용한 sort
             * => sort를 한 List를 array 에 하나씩 담아주는 방식
              */
            List<Integer> sortedList = sets.stream().sorted().collect(Collectors.toList());
            for (int i = 0; i < sortedList.size(); i++) {
                answer[i] = sortedList.get(i);
            }

            /**
             * sort 하는 방법 2 - array 를 sort 하는 방법
             * => Set 의 인자값들을 array에 담고 sort 해주는 방식
              */
            Iterator<Integer> iterator = sets.iterator();
            int idx = 0;
            while (iterator.hasNext()) {
                answer[idx] = iterator.next();
                idx++;
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}
