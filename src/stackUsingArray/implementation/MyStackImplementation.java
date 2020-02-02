package stackUsingArray.implementation;

import stackUsingArray.defination.MyStackDefination;

import java.util.Scanner;

public class MyStackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stacksize = scanner.nextInt();
        MyStackDefination myStackDefination = new MyStackDefination(stacksize);
        System.out.println("My stack SIze is " + myStackDefination.getSize());
        myStackDefination.push(12);
        myStackDefination.push(13);
        System.out.println("My stack SIze is " + myStackDefination.getSize());
        System.out.println("Popped element is " + myStackDefination.pop());
        System.out.println("My stack SIze is " + myStackDefination.getSize());
        System.out.println("Peek element " + myStackDefination.peek());
        System.out.println(myStackDefination.search(12) ? "true" : "false");
        /*int maxSizeOfStack = 10;
        MyStackDefination  stack = new MyStackDefination(maxSizeOfStack);
        int element = stack.peek();
        element = stack.pop();

        boolean check = stack.isEmpty();

        System.out.println("size of stack =" + stack.getSize());

        stack.push(200);
        System.out.println("size of stack =" + stack.getSize());
        for (int i = 0; i < 100 ; i++) {
            stack.push(new Random().nextInt(100));
        }
        System.out.println("size of stack =" + stack.getSize());*/


    }
}
