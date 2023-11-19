package directory;
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
                //String test= "test";
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
        




    