public class Pet{
    
    String type;
    String name;
    String birthDate;
    String owner;
    double weight;
    String sex;
    String color;
    
    //Constructor with set default values
    public Pet(){
        type = "default";
        name = "default";
        birthDate = "default";
        owner = "default";
        weight = 00.00;
        sex = "default";
        color = "default";
    }
   
    //Constructor that takes in arguments
    public Pet(String t, String n, String b, String o, double w, String s, String c){
        type = t;
        name = n;
        birthDate = b;
        owner = o;
        weight = w;
        sex = s;
        color = c;
    }
    
    //Speak method that is overridden
    public void speak(){}
    
    
    public String getTag(){
        return "If lost, call " + owner;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\n"
                + "Type: " + type + "\n"
                + "Birth Date: " + birthDate + "\n"
                + "Owner: " + owner + "\n"
                + "Weight: " + weight + "\n"
                + "Sex: " + sex + "\n"
                + "Color: " + color;
    }
}
