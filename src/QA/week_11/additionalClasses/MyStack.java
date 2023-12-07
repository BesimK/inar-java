package QA.week_11.additionalClasses;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack extends ArrayList {
    private ArrayList<Objects> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize()-1);
    }
    public Object pop(){
        Object o = list.get(getSize()-1);
        list.remove(o);
        return o;
    }
    public void push(Object o){
        list.add((Objects) o);
    }
    @Override
    public String toString(){
        return "Stack : " + list.toString();
    }
}
