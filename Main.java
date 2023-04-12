public class Main{
    public static UserGUI user;
    public static AdminGUI admin;

    public static Window mainW;
    public static Movies mv =new Movies(2,"rrr","fd","fdf",12.2f,"fgg");
    public static int no= 55;
    public static void main(String[] args){


        admin = new AdminGUI();
        user = new UserGUI();
        mainW = new Window();

    }

}