public class Main {
    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(13);
        s.push(14);
        s.display();
        System.out.println(s.length());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.length());
        System.out.println(s.peek());
        System.out.println(s.length());
    }
}
