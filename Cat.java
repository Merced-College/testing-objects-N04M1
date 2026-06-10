//Naomi Rodriguez
//6/9/2026
//Cat Class for my Cat objects

public class Cat {
    
    //Data variables
    private String name;
    private boolean friendly;
    private String hair;

    //construcutors

    public Cat() {            // default constructor
        name = "Unknown";
        friendly = true;
        hair = "Can't tell";
    }

    public Cat(String name, boolean friendly, String hair) { // parameterized constructor
        this.name = name;
        this.friendly = friendly;
        this.hair = hair;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public boolean getFriendly() { 
        return friendly; 
    }
    public void setFriendly(boolean friendly) { 
        // simple guard (optional)
        if (!friendly) 
            this.friendly = friendly; 
        
    }

    public String getHair() { 
        return hair; 
    }

    public void setBreed(String hair) { 
        this.hair = hair; 
    }

    @Override
    public String toString() {
        return "Cat{name = '" + name + "', friendly = " + friendly + ", hair type = '" + hair + "'}";
    }
    
}
