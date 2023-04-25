public class tcf {
    public static void main(String[] args) {
        try{
            int b = 0;
            int ans = 5/b;
            if(b == 0){

                throw new ArithmeticException("My bad");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
