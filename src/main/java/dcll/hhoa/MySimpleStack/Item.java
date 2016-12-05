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

    /**
     * Un commentaire repondant a l'exigence #1
     * @param value
     */

    public void setValue(Object value){
        this.value = value;
    }
}
