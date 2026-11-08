package pkg07labexer1;

public class Main {

    public static void main(String[] args) {

        char nameMonth[] = {
            'E', 'p', 'h', 'r', 'a', 'i', 'm', ' ',
            'F', 'e', 'b', 'r', 'u', 'a', 'r', 'y'};

        String naMonth = new String(nameMonth);
        System.out.println(nameMonth);

        String startEnd = new String(nameMonth, 0, 7);
        System.out.println(startEnd);

        byte byteArr[] = {
            69, 112, 104, 114, 97, 105, 109, 32,
            70, 101, 98, 114, 117, 97, 114, 121};
        
        String nameByte = new String(byteArr);
        System.out.println(nameByte);
        
        String byteStartEnd = new String(byteArr, 8, 8);
        System.out.println(byteStartEnd);
    }

}
