public class Node<E> {
    private Node parent;
    private Node child;
    private E data;

    public Node() {
        //empty constructor
    }

    public Node(E data){
        this.data = data; //constructor w/ 1 parameter
    }

    public Node(Node<E> parent, Node<E> child, E data){
        //constructor w/ 3 parameters
        this.parent = parent; //...for Node parent
        this.child = child;  //...for Node child
        this.data = data;  //...for data
    }

    //mutator/setter methods
    public void setParent(Node<E> parent){
        this.parent = parent; //
    }

    public void setChild(Node<E> child) {
        this.child = child; //
    }

    public void setData(E data) {
        this.data = data; //
    }

    //accessor methods
    public Node<E> getParent() {
        return parent; //returns parent node
    }

    public Node getChild() {
        return child; //returns child node
    }

    public E getData() {
        return data; //returns data
    }

    //toString
    @Override
    public String toString() {
        //
        return "node: " + data;
    }
    public boolean same(Node<E> node) {
        //
        return data.same(node.data);
    }
}
