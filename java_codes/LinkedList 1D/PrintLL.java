

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PrintLL {

    // function to print linked list
    public static void print(Node head){

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("\n\nPrinting my linked list");
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // function to insert an element at the begining of linked list
    public static void insertInBegining(Node head, int data){
        System.out.print("Inserting element -> "+data);
        Node newNode = new Node(data);
        newNode.next = head;
        print(newNode);
        insertInEnd(newNode, 200);

    }

    // function to insert an element at the end of linked list
    public static void insertInEnd(Node head, int data){
        System.out.print("\nInserting element at end ->"+ data);
        Node newNode = new Node(data);
        Node temp = head;
        while(temp !=null){
            if(temp.next == null){
                temp.next = newNode;
                break;
            }
            temp =temp.next;
        }
        print(head);
    }

    // function to convert array to linked list
    public static void arrayToLL(int array[]){

        System.out.println("Array to linked list conversion");
        if(array.length == 0){
            System.out.println("Array is empty");
            return;
        }
        Node head = new Node(array[0]);
        Node temp = head;
        System.out.print(temp.data+" ");

        for(int i = 1;i<array.length;i++){
            temp.next = new Node(array[i]);
            temp = temp.next;
            System.out.print(temp.data+" ");
        }

        print(head);

        System.out.println("\n\nInserting an Element in array at athe begining of linked list");
        insertInBegining(head,100);
      
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5};
        arrayToLL(array);
        
    }    
}
