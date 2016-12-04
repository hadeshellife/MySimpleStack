package dcll.hhoa.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by Hades on 12/4/16.
 */
public class SimpleStackImpl implements SimpleStack {
    Stack<Objects> wrappedStack = new Stack<Object>;

    public boolean isEmpty(){
        return wrappedStack.isEmpty();

    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push(Item item){
        wrappedStack.push(Item);
    }

    public void peek() throws EmptyStackException{
        wrappedStack.peek();
    }

    public void pop() throws EmptyStackException{
        wrappedStack.pop();
    }
}
