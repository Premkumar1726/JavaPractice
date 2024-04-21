package Singly_Linked_List;

public class Main {
    public static void main(String[]args){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.append("ware");
        list.append("ware");
        list.append("wa");
        list.append("Pain");
        list.display();
        System.out.println(list.length());
        list.removeAtEnd();
        list.display();
        System.out.println(list.length());
    }
}
