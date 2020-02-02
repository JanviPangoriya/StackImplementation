package stackUsingArray.stackmethodADT;

public interface StackMethod {
    public abstract void push(int element);

    public abstract int pop();

    public abstract int peek();

    public abstract boolean search(int element);
}
