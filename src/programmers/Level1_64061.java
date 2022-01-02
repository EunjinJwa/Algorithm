package programmers;

/**
 * 제목    : 크레인 인형뽑기 게임
 * 링크    : https://programmers.co.kr/learn/courses/30/lessons/64061
 * date   : 2022-01-02
 * Description :
 */
public class Level1_64061 {

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int bucketCount = 0;
        int[] bucket = new int[1000];
        for (int move : moves) {
            for (int[] b : board) {
                if (b[move-1] > 0) {
                    bucketCount++;
                    bucket[bucketCount] = b[move-1];
                    b[move-1] = 0;

                    if (bucketCount > 1 && bucket[bucketCount] == bucket[bucketCount-1]) {
                        answer++;
                        bucket[bucketCount] = 0;
                        bucket[bucketCount-1] = 0;
                        bucketCount = bucketCount-2;
                    }
                    break;
                }
            }
        }
        return answer*2;
    }

}
