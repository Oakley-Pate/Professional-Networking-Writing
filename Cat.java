public class Cat extends Pet{
    
    //Constructor
    public Cat(String t, String n, String b, String o, double w, String s, String c){
       super(t, n, b, o, w, s, c);
    }
    
    //Overrides speak method
    @Override
    public void speak(){
        System.out.println("meow");
    }
    
    public void scratch_post(){
        System.out.println("skkrtchh skkrtchh");
    }
    
    public void ignore_owner(){
        System.out.println("plop");
    }
    
    public void sleep(){
        System.out.println("ZZZzzzz");
    }
    
    public void climb_trees(){
        System.out.println("rustle rustle");
    }
    
}