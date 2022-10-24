public class Dog extends Pet{
    
    //Constructor
    public Dog(String t, String n, String b, String o, double w, String s, String c){
       super(t, n, b, o, w, s, c);
    }
    
    //Overrides speak method
    @Override
    public void speak(){
        System.out.println("bark! bark!");
    }
    
    public void roll_over(){
        System.out.println("flump");
    }
    
    public void play_dead(){
        System.out.println("*silence*");
    }
    
    public void sit(){
        System.out.println("*sits*");
    }
    
    public void whine(){
        System.out.println("hmmmhm hmmh");
    }
    
    public void wag_tail(){
        System.out.println("wag wag wag");
    }
    
}
