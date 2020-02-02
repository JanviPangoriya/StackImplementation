package stackUsingArray.defination;

import stackUsingArray.stackmethodADT.StackMethod;

public class MyStackDefination implements StackMethod {
    private int[] data;
    private int size;
    private int top;

    public MyStackDefination(int ArraySize) {
        data = new int[ArraySize];
        top = 0;
        size = 0;
    }

    @Override
    public void push(int element) {
        if (!isFull()) {
            data[top] = element;
            top++;
            size++;
        }
    }

    public boolean isFull() {
        boolean response = false;
        if (top == data.length)
            response = true;
        return response;
    }

    @Override
    public int pop() {
        int response = 0;
        if (!isEmpty()) {
            top--;
            size--;
            response = data[top];
        } else {
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (top == 0) {
            response = true;
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()) {
            response = data[top - 1];
        } else {
            System.out.println("Stack is underflow");
        }
        return response;
    }

    @Override
    public boolean search(int element) {
        boolean response = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                response = true;
                break;
            }
        }
        return response;
    }

    public int getSize() {
        return size;
    }
}
