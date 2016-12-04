package dcll.hhoa.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by Hades on 12/4/16.
 */
public interface SimpleStack {
    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
