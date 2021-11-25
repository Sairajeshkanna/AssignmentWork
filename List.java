class Node {
    int data;
    Node next;
    Node prev;
};

class DoublyLinkedList {
  Node head;

  DoublyLinkedList(){
    head = null;
  }

  //Adding new element
  void add(int newElement) {
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null;
    newNode.prev = null; 
    if(head == null) {
      head = newNode;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
      newNode.prev = temp;
    }    
  }
  
  
  //Deleting element by index position
  void delete(int position) {     
    if(position < 1) {
      System.out.print("\nThe index position should be >= 1.");
    } else if (position == 1 && head != null) {
      Node nodeToDelete = head;
      head = head.next;
      nodeToDelete = null;
      if (head != null)
        head.prev = null;
    } else {
      Node temp = new Node();
      temp = head;
      for(int i = 1; i < position-1; i++) {
        if(temp != null) {
          temp = temp.next;
        }
      }
      if(temp != null && temp.next != null) {
        Node nodeToDelete = temp.next;
        temp.next = temp.next.next; 
        if(temp.next.next != null)
          temp.next.next.prev = temp.next;  
        nodeToDelete = null; 
      } else {
        System.out.print("\nThe node is already null.");
      }       
    }
  } 
   //Delete last node 
  void Deletelastnode() {
    if(this.head != null) {
      if(this.head.next == null) {
        this.head = null;
      } else {
        Node temp = new Node();
        temp = this.head;
        while(temp.next.next != null)
          temp = temp.next;
        Node lastNode = temp.next;
        temp.next = null; 
        lastNode = null;
      }
    }
  }
  //Searching element 
  void Search(int Value) {
    Node temp = new Node();
    temp = this.head;

    int found = 0;
    int i = 0;

    if(temp != null) {
      while(temp != null) {
        i++;
        if(temp.data == Value) {
          found++;
          break;
        }
        temp = temp.next;
      }
      if (found == 1) {
        System.out.println(Value + "   at index = " + i +".");
      } else {
        System.out.println(Value + "  not  in the list.");
      }
    } else {
      System.out.println("The list is empty.");
    }
  }   

  //display the content of the list
  void ListPrinting() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list : ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }    
};

public class List{
  public static void main(String[] args) {
    DoublyLinkedList DLL = new DoublyLinkedList();

   
    DLL.add(100);
    DLL.add(110);
    DLL.add(120);
    DLL.add(130);
    DLL.add(140);
    DLL.add(150);
    DLL.ListPrinting(); 
 System.out.println("----------------------");
    DLL.delete(2);
    DLL.delete(3);
    DLL.ListPrinting();  
 System.out.println("----------------------");
    DLL.Search(150);
    DLL.Search(130);
 System.out.println("----------------------");
    DLL.Deletelastnode();
    DLL.ListPrinting();
  }
}