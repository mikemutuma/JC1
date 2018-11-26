import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<PropertyClass>list;
        list = new ArrayList<PropertyClass>();
        PropertyClass user;

        user = new PropertyClass("Jessie","jessie@utd.com","1234");
        list.add(user);

        user = new PropertyClass("Marcus","marecus@utd.com","6789");
        list.add(user);

        user = new PropertyClass("Romelu","romelu@utd.com","4444");
        list.add(user);

        System.out.println(list.toString());

    }

}
