public class Student extends User {

    public Student(){

    }
    public Student(String name){
        super(name);

    }
    private Boolean verified = false ;

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
    boolean getVerified(){
        return verified ;
    }
}



