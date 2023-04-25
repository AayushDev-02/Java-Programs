public class Exception2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};



        try{
            System.out.println(arr[10]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception -> " + e.getMessage());
        }
    }


}
