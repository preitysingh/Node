//preity's node test driver
public class NodeTestDriver {
    public static void main(String[] args) {
        //testing constructors with diff. types
        Node<Integer> node1 = new Node<>();
        Node<String> node2 = new Node<>("Hello");
        Node<Integer> node3 = new Node<>(2);
        Node<String> node4 = new Node<>(node1, node2, "ATCS!");

        //printing tests
        System.out.println("node1: "+ node1);
        System.out.println("node2: "+node2);
        System.out.println("node3: "+node3);
        System.out.println("node4: "+node4);

        //testing accessors, and toString
        System.out.println("data of node2= " + node2.getData());
        System.out.println("parent of node1= " + node1.getParent());
        System.out.println("node4 getChild: "+node4.getChild());
        node3.setData(20);
        System.out.println("should be 20--> "+ node3);

        //testing .equals and mutators
        System.out.println("Node1 before setData: " +node1);
        System.out.println("false --> " +node3.equals(node1));
        node1.setData(node3.getData());
        System.out.println("Node1 after setData: " + node1);
        System.out.println("true --> " +node3.equals(node1));


    }
}