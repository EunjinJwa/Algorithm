package programmers;

public class NewIdRecommand {

    public static void main(String[] args) {

        String id = ".sfgsgsg.";
        String newId = solution(id);
        System.out.println(id.equals(newId) ? "변화 없음" : String.format("%s -> %s", id, newId));
    }

    /**
     * [신규 아이디 추천]
     * 2021 KAKAO BLIND Recuitment
     *
     * 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는지 검사하고, 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천한다.
     *
     * 아이디 검증 절차
     * ------------------------------------------------------------------
     * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
     * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
     * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
     * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
     * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
     * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     *      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
     * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
     * ------------------------------------------------------------------
     *
     *
     */

    public static String solution(String newId) {


        // step 1
        String answer = newId.toLowerCase();

        StringBuffer answerSb = new StringBuffer();

        // step 2
        for (int i = 0; i < answer.length(); i++) {
            if (String.valueOf(answer.charAt(i)).matches("[a-zA-Z0-9_.-]")) { // 지정된 패턴 형식 문자열인 경우
                answerSb.append(answer.charAt(i));// 문자열 추가
            }
        }
        answer = answerSb.toString();
        answerSb = null;

        // step 3
        answer = answer.replace("..",".").replace("..",".");
        // step 4
        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length()-1);
        }
        // step 5
        if (answer == null || answer.length() == 0) {
            answer = "a";
        }
        // step 6 , step 7
        if (answer.length() >= 16) {
            answer = answer.substring(0,15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length()-1);
            }
        } else if (answer.length() <=2) {
            String lastStr = String.valueOf(answer.charAt(answer.length()-1));
            while (answer.length() < 3) {
                answer = answer.concat(lastStr);
            }
        }
        return answer;

    }

}
