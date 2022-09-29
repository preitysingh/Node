//preity's node test driver
public class NodeTestDriver {
    public static void main(String[] args) {
        //testing constructors with diff. types
        Node<Integer> node1 = new Node<>();
        Node<String> node2 = new Node<>("Hello");
        Node<Integer> node3 = new Node<>(2);
        Node<String> node4 = new Node<>(node1, node2, "ATCS!");

        //printing tests
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        System.out.println(node4);

        //testing mutators, accessors, and toString
        System.out.println("data of node2= " + node2.getData());
        System.out.println("parent of node1= " + node1.getParent());
        System.out.println(node4.getChild());

        //testing .equals
        System.out.println(node1.equals(node3));
        node3.setData(20);
        System.out.println(node3);
        node1.setData(node3.getData());
        System.out.println(node1);
        System.out.println(node1.equals(node3));

//        child.setData(parent.getData());
//        System.out.println("true: " + parent.equals(child));


//        System.out.println("null -- " + child.getChild());
//        parent.setData(15);
//        System.out.println("Node: 15 -- " + middle.getParent());
//        middle.setParent(child);
//        System.out.println("Node: 5 -- " + middle.getParent());
//        System.out.println("Node: 5 -- " + middle.getChild());
//        middle.setChild(parent);
//        System.out.println("Node: 15 -- " + middle.getChild());
//        System.out.println("10 -- " + middle.getData());
//
//        child.setData(5);
//        System.out.println(child);
//


//        Node<Integer> n = new Node<String>();
//        //testing .equals and getData method
//        System.out.println("5".equals(n.getData()));
//        //printing out your node
//        System.out.println();
//        Node<Integar> child = new Node<>();
//        Node<Integar> aunt = new Node<>(parent, child, 5);
//        Node<String> parent1 = newNode<>"Hello";
//
//        testing mutator and acessor methods + toString
//        System.out.println(aunt.getParent());

    }
}