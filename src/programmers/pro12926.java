package programmers;

/**
 * 시저 암호 만들기 대소문자 알파벳이 + n 만큼 뒤로 밀림
 * 인덱스 오버되면 앞으로 돌아옴
 * 공백은 밀어도 공백
 */
public class pro12926 {

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String str, int n) {
        StringBuilder sb = new StringBuilder();


        for(char c : str.toCharArray()) {

            if(c >= 65 && c <= 90) {
                // 대문자
                c += n;
                if(c > 90) c -= 26;
            } else if(c >= 97 && c <= 122) {
                // 소문자
                c += n;
                if (c > 122) c -= 26;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
