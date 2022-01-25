package programmers;

/**
 * 타입    :연습문
 * 제목    :핸드폰 번호 가리기
 * 링크    : https://programmers.co.kr/learn/courses/30/lessons/12948
 * date   : 2022-01-18
 * Description :
 */
public class Level1_12948 {


    public static void main(String[] args) {
        System.out.println(solution2("04444"));
    }

    public static String solution(String phone_number) {
        StringBuffer newNumber = new StringBuffer();
        for (int i = 0; i < phone_number.length(); i++) {
            newNumber.append( i < phone_number.length()-4 ? "*" : phone_number.charAt(i));
        }
        return newNumber.toString();
    }

    public static String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
