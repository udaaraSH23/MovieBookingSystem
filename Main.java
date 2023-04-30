public class Main{
    public static UserGUI user;
    public static AdminGUI admin;
    public static Window mainW;

    public static Movies mv,mv1,mv2;
    public static void main(String[] args){

        admin = new AdminGUI();
        user = new UserGUI();
        mainW = new Window();
        mv = new Movies(0,"Avengers","ENG","Action",12.4,"Movie");

    }

}