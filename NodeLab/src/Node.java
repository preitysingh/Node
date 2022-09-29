//preity's node class
public class Node<N> {
    //parent,child,data variables
    private Node parent;
    private Node child;
    private N data;

    //empty constructor
    public Node() { }

    public Node (N data){
        this.data = data; //constructor w/ 1 parameter
    }

    public Node(Node parent, Node child, N data){
        //constructor w/ 3 parameters
        this.parent = parent; //...for Node parent
        this.child = child;  //...for Node child
        this.data = data;  //...for data
    }

    //mutator/setter methods
    public void setParent(Node<N> parent){
        this.parent = parent; //
    }

    public void setChild(Node<N> child) {
        this.child = child; //
    }

    public void setData(N data) {
        this.data = data; //
    }

    //accessor methods
    public Node<N> getParent() {
        return parent; //returns parent node
    }

    public Node<N> getChild() {
        return child; //returns child node
    }

    public N getData() {
        return data; //returns data
    }

    //toString method
    @Override
    public String toString() {
        //toString method for the Node class
        String str = "Data: " + data;
        return str;
    }
    //.equals method
    public boolean equals(Node<N> node) {
        //returns whether data of Node equals to the other when you use .equals
        return data.equals(node.data);
    }
}
