public class Main {
    public static void main(String[] args){
        User u = new User("Caleb", "Gold");
        User u2 = new User();
        u2.set_name("Eve");

        System.out.println(u);
        System.out.println(u2);
    }
}
