public class Accessing_Bean {
    public static void main(String[] args) {
        Bean obj = new Bean();
        obj.setId(2);
        obj.setName("Aayush");

        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
