import java.io.Serializable;

public class Bean implements Serializable {

    private int id;
    private String name;

    public Bean(){}

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    void setId(int id){
        this.id = id;
    }

    void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
