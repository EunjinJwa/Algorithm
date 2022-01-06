package programmers;

import java.util.*;

/**
 * 타입    : 완전탐색
 * 제목    :모의고사
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/42840
 * date   : 2022-01-06
 * Description : 수열을 파악하기 어렵다..
 * 핵심 : 수포자의 정답을 패턴을 통해 배열 생성하기.
 * 수포자의 max 값 구하기 : Collections.max()
 */
public class Level1_42840 {

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 4, 4, 2, 1};
        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        // 수포자의 정답 패턴
        int[] a = {1, 2, 3, 4, 5};              //5
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};     // 8
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};   // 10

        int[] s1 = new int[answers.length];
        int[] s2 = new int[answers.length];
        int[] s3 = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
            s1[i] = a[i%5];
            s2[i] = b[i%8];
            s3[i] = c[i%10];
        }

        System.out.println("수포자1 : " + Arrays.toString(s1));
        System.out.println("수포자2 : " + Arrays.toString(s2));
        System.out.println("수포자3 : " + Arrays.toString(s3));

        List<Integer> supojaAnswerList = new ArrayList(3);
        supojaAnswerList.add(0);
        supojaAnswerList.add(0);
        supojaAnswerList.add(0);

        for (int i = 0; i < answers.length; i++) {
            int as = answers[i];
            supojaAnswerList.set(0, supojaAnswerList.get(0) + (as == s1[i] ? 1 : 0));
            supojaAnswerList.set(1, supojaAnswerList.get(1) + (as == s2[i] ? 1 : 0));
            supojaAnswerList.set(2, supojaAnswerList.get(2) + (as == s3[i] ? 1 : 0));
        }
        System.out.println(supojaAnswerList);

        int maxScore = Collections.max(supojaAnswerList);
        List<Integer> maxScoreList = new ArrayList();
        for (int i = 0; i < supojaAnswerList.size(); i++) {
            if (supojaAnswerList.get(i) == maxScore)
                maxScoreList.add(i+1);
        }

        int[] answer = new int[maxScoreList.size()];
        for (int i = 0; i < maxScoreList.size(); i++) {
            answer[i] = maxScoreList.get(i);
        }
       return answer;
    }
}
