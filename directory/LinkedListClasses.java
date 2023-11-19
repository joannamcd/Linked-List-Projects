package directory;
//tests

//import java.io.IOException;
import java.util.Scanner;

class Node {
    String str;
    Node next;
}

class Main {
    public static Node push(Node head, String data){
        Node jn = new Node();
        jn.str = data;
        jn.next = head;
        head = jn;
        return head;
    }

    public static int position(Node head, String find){
        //traverse through llist, start at pos 0 until next is null
        Node pointer = head;
        //Node prev = head;
        int iterate = 0;
        while (pointer != null){
            if(pointer.toString() == find){
                return iterate;
            }
            iterate++;
            pointer = pointer.next;
        }
        return -1;
    }

    /*public static Node deleteNode(Node head, String data){
        Node temp = head;
        Node prev = head;
        int nPosition = position(head, data);
        if(nPosition < 0){
            System.out.println("Item is not in list");
            return head;
        }
        for(int i=0; i< nPosition; i++){
            if(i==0 && nPosition ==1){
                head = head.next;
            }
            else if(i==nPosition-1 && temp != null){
                prev.next = temp.next;
            }
            else{
                prev=temp;
            
                if(prev == null){
                    break;
                }
            temp = temp.next;
            }
        }
        return head;
    }*/

    public static Node deleteN(Node head, String position) {
        
      
        
        
        Node temp = head; // Create a temporary node pointing to the head of the linked list
        Node prev = null; // Create a previous node pointing to the head of the linked list
        int iterate = 0;
        
        
        if(head != null){
            Node currNode = head;
        
            if((head.str).equals(position)){
                head = head.next;
                //prev.next = head;
                //delete currNode
            }
        else{
            Node prevNode = null;
            while(currNode != null && (!(currNode.str).equals(position))){
                prevNode = currNode;
                currNode = currNode.next;
            }
                //check if we found targetValue
                if(currNode != null){
                    //did find it
                    prevNode.next = currNode.next;
                    
                }
            }
        }
        return head;
    }
        
    
    

    public static void printList(Node head){
        while(head != null){
            if(head.next == null){
                System.out.println("[" + head.str + "] [" + head + "] ->" + "(null)");
            }
            else{
                System.out.println("[" + head.str + "] [" + head + "] ->" + head.next);
            }
            head = head.next;
        }
        System.out.println();
        System.out.println();
    }


    public static void main (String[] args){
        String myScan;
        Node head = new Node();
        head.next = null;
        //head = push(head, "test");
        //head = push(head, "test2");
        //head = push(head, "test3");
        //printList(head);
        Scanner scan = new Scanner(System.in);
        int numb = 1;
        String response;
        String uName;
        for(int i=0; i<numb; i++){
            System.out.println("Type the symbol for what action you want to take:\nInput a new name: I \nRemove a name: R\nView list: V");
            response = scan.nextLine();
            if(response.equals("I")){
                System.out.println("What name?");
                uName = scan.nextLine();
                head = push(head, uName);
            }
            else if(response.equals("R")){
                System.out.println("What name?");
                uName = scan.nextLine();
                //int np = Integer.parseInt(scan.nextLine());
                head = deleteN(head, uName);
            }
            else if(response.equals("V")){
                printList(head);
            }
            System.out.println("Continue? Y/N");
            myScan = scan.nextLine();
            if(myScan.equals("Y")){
                numb++;
            }
        }
        scan.close();
    }
}
        //Scanner scan1 = new Scanner(System.in);
        /*Boolean truth = true;
        while(truth == true){
            head = push (head, "hello");
            Scanner scan1 = new Scanner(System.in);
            System.out.println("do what?");
            String myAns = scan1.nextLine();
            if(myAns == "e"){
                System.out.println("end");
                truth = false;
            }
            else if(myAns == "i"){
                head = push(head, "inputs");
            }
            scan1.close();
        }*/
        
        //printList(head);
        //Scanner scan = new Scanner(System.in);
        /*while(true){//infinite loop
            String name;
            String answer;

            
            System.out.println("Type the symbol for what action you want to take: \nInput a new name: I \nRemove a name: R\nExit: E ");
            answer = scan.nextLine();

            if(answer.equals("I")){
                System.out.println("What name do you want input?");
                name = scan.nextLine();
                System.out.println(name);
                push(head, name);
                push(head, "megan");
                printList(head);
                System.out.println("head is" + head.str);
                //System.out.println("Trying to print");
                //Node temp = head;
                //while(temp != null){
                    //System.out.println(temp.str + " ");
                    //temp = temp.next;
                //}
                //System.out.println("The current list is:");
                //System.out.println(printLinkedList(head));
            }
            else if(answer.equals("R")){
                System.out.println("What name do you want removed?");
                name = (scan.nextLine()).toString();
                deleteNode(head, name);
            }
            else if(answer.equals("V")){
                printList(head);
                System.out.println("head is" + head.str);
            }

            else if(answer.equals("E")){
                System.out.println("Bye!");
                break; 
            }
            
        }
        scan.close(); */



/*class Node{
            String data;
            Node next;
            Node head;

            public Node(String data){
                this.data = data;
                this.next = null;
                this.head = null;
            }

            
        }

public class LinkedListClasses{
    

    /*void add_node(String data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    //insert a new node at the front of the list
    public static Node push(Node head, String ndata){
        Node new_node = new Node(ndata);
        new_node.next = head;
        head = new_node;
        return head;
    }

    //insert a new node at the after a given node
    public void insertAfter(Node prev_node, String new_data){
        //is given node null or not
        if(prev_node == null){
            System.out.println("Can't insert, previous node is null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    /*public static void append(Node head, String new_data){
        Node new_node = new Node(new_data);
        Node newnode = new Node();
        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    
    public static int deleteNode(Node head, String val){
        if(head == null){
            System.out.println("Name is not in the list");
            return -1;
        }

        if(head.data == val){
            if(head.next != null){
                head.data = head.next.data;
                head.next = head.next.next;
                return 1;
            }
            else{return 0;}
        }
        if (deleteNode(head.next, val)==0){
            head.next = null;
            return 1;
        }

        return -1;
    }

    public static void printLinkedList(Node head){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    

    

    public static void main (String[] args){
        Node head = new Node();
        Scanner scan = new Scanner(System.in);
        while(true){//infinite loop
            String name;
            String answer;

            
            System.out.println("Type the symbol for what action you want to take: \nInput a new name: I \nRemove a name: R\nExit: E ");
            answer = scan.nextLine();

            if(answer.equals("I")){
                System.out.println("What name do you want input?");
                name = scan.nextLine();
                System.out.println(name);
                push(head, name);
                System.out.println("Trying to print");
                Node temp = head;
                while(temp != null){
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }
                //System.out.println("The current list is:");
                //System.out.println(printLinkedList(head));
            }
            else if(answer.equals("R")){
                System.out.println("What name do you want removed?");
                name = (scan.nextLine()).toString();
                deleteNode(head, name);
            }
            /*else if(answer.equals("V")){
                printLinkedList(head);
                System.out.println("head is" + head.data);
            }

            else if(answer.equals("E")){
                System.out.println("Bye!");
                break; 
            }
            
        }
        scan.close();

    }
}
*/
//public class LinkedListClasses{

    //Linked List
/*    public class LinkedList{
        
}

    public class DLL{
        class Node{
            int data;
            Node prev;
            Node next;

            Node(int d1){
                data = d1;
            }
        }

        public class DoublyLinkedList{
            public Node head;
            public DoublyLinkedList(){
                head = null;
            }
            public void addNode(int data){
                Node newNode = new Node(data);
                newNode.next = head;
                if(head != null){
                    head.prev = newNode;
                }
                head = newNode;
            }
        }

    }

    public class CLL{
        class Node{
            public int data;
            public Node next;

            public Node(int d){
                data = d;
                next = null;
            }
        }
        class CircularLinkedList{
            public Node head;

            public CircularLinkedList(){
                head = null;
            }

            public void add_node(int data){
                Node new_node = new Node(data);
                //if head doesn't exist, initialize head 
                if(head == null){
                    head = new_node;
                    new_node.next = head;
                    return;
                }
                Node current = head;
                //continue around circle until reaching the node before head
                while(current.next != head){
                    current = current.next;
                }
                //set current node's next value to be new_node instead of head
                current.next = new_node;
                //set new_node's next value to be head
                new_node.next = head;
            }
        }
    }
}*/