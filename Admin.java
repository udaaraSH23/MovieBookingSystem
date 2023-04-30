import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Admin implements Serializable,AdminInterface {

    private static String username="0000";

    private static String password="0000";

    public Admin() {
    }


    public void setUsername(String usr){
        username = usr;
    }
    public void setPassword(String usr){
        password = usr;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return  password;
    }




}
