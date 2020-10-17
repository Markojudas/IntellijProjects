package academy.learnprogramming.linkedlists;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDone = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println("Is the List Empty?");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(list.isEmpty());
        System.out.println("\n");

        list.addToFront(janeJones);
        list.addToFront(johnDone);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("GET THE SIZE OF THE LIST, HOW MANY EMPLOYEES?");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("SIZE: " + list.getSize());
        System.out.println("-----------------------------------------------------------------------------------------\n");
        System.out.println("List:");
        list.printList();

        System.out.println("\nRemove from the list:");
        System.out.println("-----------------------------------------------------------------------------------------");
        list.removeFromFront();
        System.out.println("size after removal: " + list.getSize());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("New List:");
        list.printList();



    }
}
