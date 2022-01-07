package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 타입    :
 * 제목    :정수 내림차순으로 배치하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/12933
 * date   : 2022-01-08
 * Description : 다른사람의 람다 풀이에 이마를 탁 친다.. 하..
 * stream.sorted
 * Comparator.reverseOrder
 *
 */
public class Level1_12933 {

    public static void main(String[] args) {
        System.out.println(solution(118372));
        System.out.println(solution2(118372));
    }

    public static long solution2(long n) {
        StringBuilder sb = new StringBuilder();
        String.valueOf(n).chars().mapToObj(ch -> (char)ch)
                .sorted(Comparator.reverseOrder())
                .forEach(s -> sb.append(s));
        return Long.parseLong(sb.toString());
    }


    public static long solution(long n) {
        long answer = 0;

        List<Integer> numList = new ArrayList<>();
        String numStr = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
            numList.add(Integer.parseInt(String.valueOf(numStr.charAt(i))));
        }

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override public int compare(Integer i1, Integer i2) {
            return i1 - i2 > 0 ? -1 : i1 == i2 ? 0 : 1;
            }
        };

        Collections.sort(numList, comp);
        StringBuilder intStr = new StringBuilder();
        numList.stream().forEach(i -> intStr.append(i));
        answer = Long.parseLong(intStr.toString());

        return answer;
    }
}
