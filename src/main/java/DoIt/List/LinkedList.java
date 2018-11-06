package DoIt.List;

public class LinkedList {
    class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
}
