package programmers;

/**
 * 타입    :연습문
 * 제목    :하샤드 수
 * 링크    : https://programmers.co.kr/learn/courses/30/lessons/12947
 * date   : 2022-01-25
 * Description :
 */
public class Level1_12947 {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(11));  
    }

    static class Solution {
        public boolean solution(int x) {
            int sumNum = 0;
            int number = x;
            while (number > 0) {
                sumNum += number%10;
                number = number/10;
            }
            System.out.println(x + " , " +sumNum);
            System.out.println(x%sumNum);
            System.out.println(11%2);
            return x%sumNum == 0;
        }
    }

}
