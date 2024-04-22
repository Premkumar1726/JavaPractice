package Singly_Linked_List;

public class Main {
    public static void main(String[]args){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        System.out.println(list.isEmpty());
        list.append("ware");
        list.append("ware");
        list.append("wa");
        list.append("Pain");
        list.display();
        System.out.println(list.length());
        list.remove("wa");
        list.display();
        list.insertAfter("Minato","ware");
        list.display();
        System.out.println(list.length());
        System.out.println(list.isEmpty());
        System.out.println(list.search("Minato"));
        list.prepend("Naruto");
        list.display();
        list.removeAtEnd();
        list.display();
        list.removeFirst();
        list.display();
    }
}
