package programmers;

/**
 * 제목    :음양 더하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/76501
 * date   : 2022-01-06
 * Description : 엄청 쉬움
 */
public class Level1_76501 {

    public static void main(String[] args) {
        int[] absolutes = {1,2,3,4,5,7,14,73};
        boolean[] signs = {true,true,false,false,true,false,true,true};
        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : absolutes[i]*-1;
        }
        return answer;
    }
}
