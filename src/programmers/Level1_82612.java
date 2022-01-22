package programmers;

/**
 * 타입    :위클리 챌린지
 * 제목    :부족한 금액 계산하기
 * 링크    :https://programmers.co.kr/learn/courses/30/lessons/82612
 * date   : 2022-01-22
 * Description :
 */
public class Level1_82612 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(3,20,4));
        System.out.println(solution.solution2(3, 20, 4));
    }

    static class Solution {
        public long solution(int price, int money, int count) {
            long totalAmount = 0;
            for (int i = 1; i <= count; i++) {
                totalAmount += price*i;
            }

            return totalAmount <= money ? 0 : totalAmount - money;
        }

        /**
         * 수학적인 생각으로 접근했을 때...
         * (1*price + 2*price + 3*price) = (1+2+3)*price
         * (1 + 2 + 3+ ... + n) = (n+1)*n/2
         * @param price
         * @param money
         * @param count
         * @return
         */
        public long solution2(int price, int money, int count) {
            return Math.max(price*((count + 1) * count/2) - money, 0);
        }
    }
}
