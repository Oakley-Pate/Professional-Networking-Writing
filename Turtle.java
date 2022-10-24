public class Turtle extends Pet{
    
    //Constructor
    public Turtle(String t, String n, String b, String o, double w, String s, String c){
       super(t, n, b, o, w, s, c);
    }
    
    //Overrides speak method
    @Override
    public void speak(){
        System.out.println("grunt! grunt!");
    }
    
    public void crawl(){
        System.out.println("slow walk");
    }
    
    public void hide_in_shell(){
        System.out.println("shoomp");
    }
    
    public void swim(){
        System.out.println("glug glug");
    }
    
}
