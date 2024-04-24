import java.util.ArrayList;
import java.util.List;

public class Stack <Thing>{
    ArrayList<Thing> list = new ArrayList<>();
    void push(Thing item){
        list.add(item);
    }
    boolean isEmpty(){
        return list.isEmpty();
    }

    Thing pop(){
        if(isEmpty())
            return null;
        return list.removeLast();
    }

    int length(){
        return list.size();
    }
    Thing peek(){
        if(isEmpty())
            return null;
        return list.getLast();
    }
    void display(){
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
