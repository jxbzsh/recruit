package Test;

public class Test {
    public static void main(String[] args) {
        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5);  //"abcd"
    }

}
