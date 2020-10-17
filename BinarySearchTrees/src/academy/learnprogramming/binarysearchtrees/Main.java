package academy.learnprogramming.binarysearchtrees;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        System.out.println("=======================================================================================");
        System.out.println("Traversing the Tree inOrder");
        System.out.println("=======================================================================================");
        System.out.println();

        intTree.traverseInOrder();
        System.out.println("\n");

        System.out.println("=======================================================================================");
        System.out.println("Searching for 27, 17, & 8888");
        System.out.println("=======================================================================================");
        System.out.println();

        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8888));
        System.out.println();

        System.out.println("=======================================================================================");
        System.out.println("Min & Max value");
        System.out.println("=======================================================================================");
        System.out.println();

        System.out.println(intTree.min());
        System.out.println(intTree.max());
        System.out.println();

        System.out.println("=======================================================================================");
        System.out.println("Delete a node");
        System.out.println("=======================================================================================");
        System.out.println();

        intTree.delete(27);
        intTree.traverseInOrder();
        System.out.println("\n");
    }
}
