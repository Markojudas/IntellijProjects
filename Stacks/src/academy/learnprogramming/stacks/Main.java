package academy.learnprogramming.stacks;

public class Main {

    public static void main(String[] args) {

        //using a array
        //not dynamic - fixed sized

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        System.out.println("=========================================================================================");
        System.out.println("PRINT STACK");
        System.out.println("=========================================================================================");
        System.out.println("");
        stack.printStack();

        System.out.println("=========================================================================================");
        System.out.println("PEEK THE TOP");
        System.out.println("=========================================================================================");
        System.out.println("");
        System.out.println(stack.peek());

        System.out.println("");
        System.out.println("=========================================================================================");
        System.out.println("POP THE STACK");
        System.out.println("=========================================================================================");
        System.out.println("");

        System.out.println("Popped: " + stack.pop());
        System.out.println("NEW TOP: " + stack.peek());
    }
}
