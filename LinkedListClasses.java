//tests

public class LinkedListClasses{

    //Linked List
    public class LinkedList{
        class Node{
            int data;
            Node next;

            Node(int d1){
                data = d1;
                next = null;
            }
        }

        public class SinglyLinkedList{
            Node head;
            SinglyLinkedList(){
                head = null;
            }

            void add_node(int data){
                Node new_node = new Node(data);
                new_node.next = head;
                head = new_node;
            }

            //insert a new node at the front of the list
            public void push(int ndata){
                Node new_node = new Node(ndata);
                new_node.next = head;
                head = new_node;
            }
        }
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
}