package basic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class B {

	public static void main(String[] args) {

		ArrayDeque<String> name = new ArrayDeque<>();

		name.push("ankit");
		name.push("Anas");
		name.push("ankita");

		System.out.println(name);
		name.pop();
		System.out.println(name);
	}

}
