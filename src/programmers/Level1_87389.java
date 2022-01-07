package programmers;

/**
 * 타입    :
 * 제목    :나머지가 1이 되는 수 찾기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/87389
 * date   : 2022-01-08
 * Description :
 */
public class Level1_87389 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (n%i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
