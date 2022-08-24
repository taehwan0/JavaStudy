package programmers;

public class pro12943 {

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    /**
     * 문제의 기본 제시는 (int num) 을 받도록 되어있는데 연산중에 자료형이 담을 수 있는 값의 크기 범주를 넘어버리며 변질된 값으로 결과가 실행된다.
     * 따라서 크기가 커지는 num 을 long 타입으로 받도록 했다. int 형으로 받고 long 으로 내부에서 변수를 사용하는 것도 방법이 될 수 있다.
     */
    public static int solution(long num) {
        for (int i = 0; i < 500; i++) {
            if(num == 1) return i;

            if(num % 2 == 0) num = num / 2;
            else num = (num * 3) + 1;

//            삼항 연산자로 조금 더 깔끔하게 작성하기
//            num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
        }
        return -1;
    }
}
