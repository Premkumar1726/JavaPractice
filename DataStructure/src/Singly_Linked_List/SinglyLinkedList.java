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

    void prepend(Thing Item){
        Node<Thing> temp = new Node<>(Item);
        if(this.First == null)
           this.First = temp;
        else{
           temp.Next = this.First;
           this.First = temp;
        }
    } 

    void insertAfter(Thing Item, Thing key){
        Node<Thing> temp = new Node<>(Item);
        Node<Thing> cur = this.First;
        while(cur.Data != key)
            cur = cur.Next;
        temp.Next = cur.Next;
        cur.Next = temp;
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

    boolean isEmpty(){
        return (this.First == null);
    }

    boolean search(Thing key){
        if(this.First == null)
            System.out.println("The list is empty");
        else{
            Node<Thing>cur = this.First;
            while(cur != null){
                if(cur.Data == key)
                    return true;
                else
                    cur = cur.Next;
            }
        }
        return false;
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

    void removeFirst(){
        if(this.First == null)
            System.out.println("The list is empty");
        else{
            Node<Thing>cur = this.First;
            System.out.println("Deleted item: "+cur.Data);
            this.First = cur.Next;
            cur = null;
        }
    }

    void remove(Thing Key){
        Node<Thing>cur = this.First;
        Node<Thing>pre = null;
        if(this.First.Next == null)
            removeFirst();
        else{
            while(cur.Data != Key){
                pre = cur;
                cur = cur.Next;
            }
            pre.Next = cur.Next;
            System.out.println("Deleted item: "+cur.Data);
        }
        
    }
}
