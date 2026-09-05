public class testing {
    public static void main (String[] args) {
        try {
            int number = 10 ;
            int x = number / 0;
        }catch(ArithmeticException e){
            System.out.println("cant divide by 0");
        }


    }
}