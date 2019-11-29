public class LinkedList {

    public Node head;
    public int listCount;


    public LinkedList(){
        head = new Node(0);
        listCount = 0;
    }

    public void show(){
        Node current = head;
        while(current.next!=null){
            System.out.print(current.id+"->");
            current = current.next;
        }
        System.out.println(current.id);
    }


    public boolean addTail(int d){
        Node end = new Node(d);
        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        listCount++;
        System.out.println("AddTail");
        return true;
    }


    public boolean addHead(int d){
        Node end = new Node(d);
        Node current = head;

        end.next = head;
        head = end;
        System.out.println("AddHead");
        return true;
    }

    public boolean addAtPosition(int d, int position){
        Node end = new Node(d);
        Node current = head;
        int jump = 1;
        position--;

        while(current.next != null && jump != position) {
            current = current.next;
            jump++;
        }
        end.next = current.next;
        current.next = end;
        return true;
    }




    public static void main(String[] args) {

        LinkedList L = new LinkedList();
        L.addTail(1);
        L.addTail(2);
        L.addTail(3);
        L.addTail(4);
        L.addTail(5);
        L.show();
        L.addAtPosition(98, 3);
        L.show();
      /*

      < OUTPUT >

      1 appended to tail!
      0 -> 1
      2 appended to tail!
      0 -> 1 -> 2
      3 appended to tail!
      0 -> 1 -> 2 -> 3
      Success! Node with data 2 deleted.
      0 -> 1 -> 3
      Delete Failed: index out of bounds of size of linked list!!
      0 -> 1 -> 3
      Success! Node at index 1 deleted.
      0 -> 3

      <end of OUTPUT>

      */
    }


}
