package dcll.hhoa.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hades on 12/5/16.
 */
public class SimpleStackImplTest {
    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception{
        simpleStack = new SimpleStackImpl();
        System.out.print("Je suis execute avant chaque test");
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        //la taille doit augmenter de 2
        assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void push() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        //La pile doit etre augmenter de un item
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //On doit retrouver l'object initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer  = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(),integer);
    }

    @Test
    public void peek() throws Exception {
        Item ita = new Item (new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //ne doit pas retirer l'objet de la pile
        assertEquals(1, simpleStack.getSize());
        //on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer  = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(),integer);
    }

    @Test
    public void pop() throws Exception {
        Item ita = new Item (new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        //ne doit pas retirer l'objet de la pile
        assertEquals(0, simpleStack.getSize());
        //on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer  = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(),integer);
    }

}