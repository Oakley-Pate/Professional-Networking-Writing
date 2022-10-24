public class Bird extends Pet{
    
    //Constructor
    public Bird(String t, String n, String b, String o, double w, String s, String c){
       super(t, n, b, o, w, s, c);
    }
    
    //Overrides speak method
    @Override
    public void speak(){
        System.out.println("chirp! chirp!");
    }
    
    public void sing(){
        System.out.println("chirpy chirpy chirp");
    }
    
    public void fly(){
        System.out.println("flutter flutter");
    }
    
    public void eat_bird_seed(){
        System.out.println("Delicious!");
    }
    
}
