package programmers;

public class pro12934 {

    public static void main(String[] args) {
        System.out.println(solution2(121));
        System.out.println(solution2(3));
    }

    public static long solution(long n) {
        double sqrt = Math.sqrt(n);
        if(sqrt % 1 == 0) {
            long r = (long) sqrt;
            r += 1;
            return r * r;
        }
        return -1;
    }

    /**
     * Math, 삼항 연산자 활용해서 좀 더 간단하게 풀기
     * @param n
     * @return
     */
    public static long solution2(long n) {
        double sqrt = Math.sqrt(n);
        return Math.floor(sqrt) == sqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
