public class User {
    private String _name;
    private String membership = "Bronze";


    public User(){

    }
    // Lets make a constructor so that we can use the class just as python User("ELY", "Gold")
    public User( String name , String membership){
        set_name(name) ;
        set_membership(membership); ;
    }
    void set_name(String name){ // this is the set method
        this._name = name ; // can also do _name = name
    }
    void set_membership(String membership){ // void means it does not return an output
        this.membership = membership;
    }
    String get_membership(){
        return membership ;
    }
    void set_membership(Membership membership){
        this.membership = membership.name() ;
    }
    public enum Membership{
        Silver,Gold, Platinum ;
    }
    /*void set_membership(Int membership ){
        this.membership = membership
        };*/
    public String toString(){
        return get_name() + " " + get_membership() ;
    }
    String get_name() {
        System.out.println("Logging to system files!");
        return _name ;
    }
}
