import org.w3c.dom.Node;

public class LL_Insertion {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void printdata(){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    //insertion at front of a linked list
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    //insertion after a given node
    public void push1(Node prev_node,int new_data1){
        if(prev_node==null){
            System.out.println("The given node cannot be null");
            return;
        }
        Node new_node1=new Node(new_data1);
        new_node1.next=prev_node.next;
        prev_node.next=new_node1;

    }
    public void append(int new_data){
        Node new_node=new Node(new_data);
        if(head==null){
            head=new Node(new_data);
            return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
        return;
    }

    public static void main(String[] args) {
        LL_Insertion ob=new LL_Insertion();
        ob.head=new Node(85);
        Node a=new Node(86);
        Node b=new Node(84);
        ob.head.next=a;
        a.next=b;
        ob.push(89);
        ob.push1(ob.head.next.next,54);
        ob.append(99);
        ob.printdata();

    }
}
