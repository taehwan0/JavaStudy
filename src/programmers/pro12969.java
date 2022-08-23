package programmers;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 두 가지 방법으로 풀어봤는데, 생각보다 Buffer 를 사용한 로직의 속도가 그렇게 빠르지는 않다.
 * 입출력이 굉장히 많아서 시간이 초과될 때만 사용하는 것이 좋겠다.
 */
public class pro12969 {
    public static void main(String[] args) throws IOException {
        /**
         * Buffer 사용해서 풀어보기.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input);

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                bw.write("*");
            }
            bw.write("\n");
            bw.flush();
        }


        /**
         * 클래식하게 풀어보기.
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 0; i < y; i ++) {
            for(int j = 0; j < x; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }

        br.close();
        bw.close();
    }
}