public class LL_Creation {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void printlist(){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        LL_Creation ob=new LL_Creation();
        ob.head=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        ob.head.next=a;
        a.next=b;
        ob.printlist();

    }
}
