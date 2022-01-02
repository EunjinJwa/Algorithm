package programmers;

/**
 * 제목    : 없는 숫자 더하기
 * 링크    : https://programmers.co.kr/learn/courses/30/lessons/86051
 * date   : 2022-01-02
 * Description :
 */
public class Level1_86051 {

    public static void main(String[] args) {

        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
        System.out.println(solution2(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i <= 9; i++) {
            boolean isExists = false;
            for (int number: numbers) {
                if (number == i) {
                    isExists = true;
                    break;
                }
            }
            if (!isExists) answer = answer+i;
        }
        return answer;
    }

    /**
     * 조금 더 간단한 방법.. 수학적인 사고가 필요하다..ㅋㅋ
     * @param numbers
     * @return
     */
    public static int solution2(int[] numbers) {
        // 0부터 9까지 합계
        int sum = (1+9)/2 * 9;  // 45
        for (int num: numbers) {
            sum -= num;
        }
        return sum;
    }

}
