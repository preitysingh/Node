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
        this.parent = parent; //reads in parent varible
    }

    public void setChild(Node<N> child) {
        this.child = child; //reads in child variable
    }

    public void setData(N data) {
        this.data = data; //reads in data variable
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
        String str = "" + data;
        return str;
    }
    //.equals method
    public boolean equals(Node n1) {
        //checks to see if one node is equal to the other
        //returns true if equal, false otherwise
        return(data == n1.getData());
    }
}
