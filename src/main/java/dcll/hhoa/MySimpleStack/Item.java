package dcll.hhoa.MySimpleStack;

/**
 * Created by Hades on 12/4/16.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(){
        this.value = value;
    }
}