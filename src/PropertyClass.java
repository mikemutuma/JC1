public class PropertyClass {

    String name,email,pass;

    public PropertyClass(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public String toString(){
        return "\nName = "+name+"\nEmail = "+email+"\nPassword = "+pass+"\n\n";
    }
}

