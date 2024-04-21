package Singly_Linked_List;

public class SinglyLinkedList <Thing>{
    private Node<Thing> First;
    public SinglyLinkedList(){
        First = null;
    }
    void append(Thing Item){
        Node<Thing> temp = new Node<>(Item);
        if(this.First == null)
           this.First = temp;
        else{
           Node<Thing> cur = this.First;
           while(cur.Next != null){
               cur = cur.Next;
           }
           cur.Next = temp;
        }
    }

    void display(){
        if(this.First == null)
            System.out.println("The List is Empty");
        else{
            Node<Thing> cur = this.First;
            while(cur != null){
                System.out.print(cur.Data + " ");
                cur = cur.Next;
            }
            System.out.println();
        }
    }

    int length(){
        int length = 0;
        if(this.First == null)
            return 0;
        Node<Thing> cur = this.First;
        while(cur != null){
            length++;
            cur = cur.Next;
        }
        return length;
    }

    void removeAtEnd(){
        if(this.First == null)
            System.out.println("the List is empty");
        else{
            Node<Thing>cur = this.First;
            Node<Thing>pre = null;
            while(cur.Next != null){
                pre = cur;
                cur = cur.Next;
            }
            System.out.println("Deleted item: "+ cur.Data);
            pre.Next = null;
        }
    }
}
