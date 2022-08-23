## BOJ

1. class 명은 Main 으로 변경해서 제출해야 함.
- class 가 추가로 필요하다면 inner class 로 선언해야 한다.
- public class 는 반드시 Main 하나!

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
```

2. 입출력
- `Scanner sc = new Scanner(System.in);` 는 속도가 느리다.
- `BufferedReader br = new BufferedReader(new InputStreamReader(System.in));` 방식으로
입력받는 것이 속도가 훨씬 빠르다.

마찬가지로 

- `System.out.println();` 은 속도가 느리다.
- `BufferedWriter bw = new BufferedWrtier(new OutputStreamWrtier(System.out));` 후에 
`bw.write(str)` 로 입력하는 것이 더 빠르다.

마지막으로 Buffer 를 사용했으니 `close()` 가 들어가야한다.

## Programmers

1. Solution class 안에서 psvm 으로 제출한다.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
```