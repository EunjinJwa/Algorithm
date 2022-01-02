package programmers;

import java.util.Arrays;

/**
 * 제목    : 로또의 최고 순위와 최저 순위 f
 * 링크    : https://programmers.co.kr/learn/courses/30/lessons/77484
 * date   : 2022-01-02
 * Description :
 */
public class Level1_77484 {

    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_numbers = {1,5,9,24,33};
        int[] result = solution(lottos, win_numbers);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroNumCount = 0;   // 모르는 숫자의 개수
        int matchedNumCount = 0;  // 맞춘 숫자의 개수

        for (int n : lottos) {
            if (n == 0) zeroNumCount++;
            for (int w : win_nums) {
                if (w == n) matchedNumCount++;
            }
        }
        // 제일 높은 등수
        answer[0] = Math.min((lottos.length - (matchedNumCount + zeroNumCount) + 1), 6);
        // 제일 낮은 등수
        answer[1] = Math.min((lottos.length - matchedNumCount + 1), 6);

        return answer;
    }

}
