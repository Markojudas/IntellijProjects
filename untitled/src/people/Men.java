package people;

public class Men {

    private int dickSize;
    private boolean hasMustache;

    public Men(){
        dickSize = 5;
        hasMustache = false;
        System.out.println("nothing interesting about me");
    }

    public Men(int dick, boolean has_Mustache){
        this();

        dickSize = dick;
        hasMustache = has_Mustache;
        battleCry();
    }

    public void battleCry(){
        System.out.println("I AM AN EVIL MAN!!!!");
        System.out.print("I have a size " + dickSize + " dick");

        if(hasMustache){
            System.out.print(" I have this bad ass Mustache");
        }else{
            System.out.println(" but I don't have a mustache");
        }
    }

}
