class Math1{
    private int z;

    public void setZ(int x){
        z = x;
    }

    public int getZ(){
        return z;
    }
}

public class Oop1 {
    public static void main(String[] args) {
        Math1 m = new Math1(); //instantiate Math1 class object

        m.setZ(5); //call setter
        System.out.println(m.getZ()); //call getter
    }
}
