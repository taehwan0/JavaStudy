package programmers;

/**
 * 신규 아이디 추천
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 */
public class pro72410 {

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));

        String filteredString = new KAKAOID(new_id)
                .toLowerCase()
                .filter()
                .replaceDuplicateDot()
                .removeDotOfHeadAndTail()
                .defaultInput()
                .limitLength()
                .padding()
                .getString();

        System.out.println(filteredString);

    }

    public static String solution(String new_id) {
        // 1. 대문자는 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2. 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 문자들을 제외
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3. . 2개 이상은 1개로 치환
        new_id = new_id.replaceAll("\\.+", ".");

        // 4. 맨앞이나 맨 뒤의 . 은 없애기
        new_id = new_id.replaceAll("^\\.", "");
        new_id = new_id.replaceAll("\\.$", "");

        // 5. 빈 문자열이면 "a" 대입
        if(new_id.length() == 0) new_id = "a";

        // 6. 16글자 이상이면, 앞의 15문자만 사용한다.
        // 제거 후 마지막 문자가 .이면 삭제
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }

        // 7. 길이가 2자 이하면 new_id 의 마지막 문자를 길이가 3 될때까지 반복
        if(new_id.length() <= 2) {
            char repeat = new_id.charAt(new_id.length() - 1);
            while(new_id.length() <= 2) {
                new_id = new_id + repeat;
            }
        }

        return new_id;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID toLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9-_.]", "");
            return this;
        }

        private KAKAOID replaceDuplicateDot() {
            s = s.replaceAll("\\.+", ".");
            return this;
        }

        private KAKAOID removeDotOfHeadAndTail() {
            s = s.replaceAll("^\\.", "");
            s = s.replaceAll("\\.$", "");
            return this;
        }

        private KAKAOID defaultInput() {
            if(s.length() == 0) s = "a";
            return this;
        }

        private KAKAOID limitLength() {
            if(s.length() >= 16) {
                s = s.substring(0, 15).replaceAll("\\.$", "");
            }
            return this;
        }

        private KAKAOID padding() {
            if(s.length() <= 2) {
                char repeat = s.charAt(s.length() - 1);
                while(s.length() < 3) {
                    s = s + repeat;
                }
            }
            return this;
        }

        private String getString() {
            return this.s;
        }
    }
}
