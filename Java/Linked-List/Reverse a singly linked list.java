class Reverse_LList

{
    
  static Node head;

    
  //creating node of the linked list
    
  //node of the linked list consists of two thing- value & link to next node
    
  static class Node {
        
    int value;
        
    Node next;

        
    Node(int val){
            
      value = val;
            
      next = null;
        
    }
    
  }
    
  //reverse function- to reverse the linked list
    
  Node reverse_LL(Node node){

        
    //initializing the previous, current and next node
        
    Node p= null;
        
    Node c= node;
        
    Node next = null;

        
    while(c != null){
            
      next=c.next;
            
      c.next=p;
            
      p=c;
            
      c=next;
        
    }

        
    node = p;
        
    return node;

   
  }

    
  //printing the linkedlist
    
  void print(Node node)
  
  {
        
    //System.out.println("The linked list is: ");
        
    while( node != null){
            
      System.out.print(node.value+" ");
            
      node=node.next;
        
    }
    
  } 

    
  public static void main(String[] args) {
        
    Reverse_LList ob = new Reverse_LList();

        
    //creating a linked list with 5 nodes
        
    //assigning values to 5 nodes
        
    ob.head = new Node(12);
        
    ob.head.next = new Node(20);
        
    ob.head.next.next = new Node(30);
        
    ob.head.next.next.next = new Node(34);
        
    ob.head.next.next.next.next = new Node(57);

        
    System.out.println("The original list is: ");
        
    ob.print(head);
        
    head=ob.reverse_LL(head);
        
    System.out.println("");
        
    System.out.println("Linked list after reversal: ");
        
    ob.print(head);
    
  }

}

