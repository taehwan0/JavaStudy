package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * boj 큐2
 * https://www.acmicpc.net/problem/18258
 * 시간 제한이 빡빡해서 입, 출력에 신경을 써야 한다.
 */
public class boj18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(in.readLine());

		IntegerQueue queue = new IntegerQueue();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < count; i++) {
			String input = in.readLine();
			String order = input.split(" ")[0];
			switch (order) {

				case "push":
					int value = Integer.parseInt(input.split(" ")[1]);
					queue.push(value);
					break;

				case "pop":
					sb.append(queue.pop()).append("\n");
					break;

				case "size":
					sb.append(queue.size()).append("\n");
					break;

				case "empty":
					if(queue.empty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;

				case "front":
					sb.append(queue.front()).append("\n");
					break;

				case "back":
					sb.append(queue.back()).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}
}

class IntegerQueue {
	List<Integer> queue = new LinkedList<>();

	void push(int value) {
		queue.add(value);
	}

	int pop() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.remove(0);
	}

	int size() {
		return queue.size();
	}

	boolean empty() {
		return queue.isEmpty();
	}

	int front() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.get(0);
	}

	int back() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.get(queue.size() - 1);
	}
}
