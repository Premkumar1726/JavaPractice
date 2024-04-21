package Singly_Linked_List;

public class Node<Thing> {
    public Thing Data;
    public Node<Thing> Next = null;
    public Node(Thing Item){
        this.Data = Item;
    }
}
