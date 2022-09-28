public class NodeTestDriver {
    public static void main(String[] args) {
        //testing
        Node<Integer> parent = new Node<>(2);
        Node<Integar> child = new Node<>();
        Node<Integar> aunt = new Node<>(parent, child, 5);

        //testing mutator and acessor methods + toString
        System.out.println(aunt.getParent());

    }
}