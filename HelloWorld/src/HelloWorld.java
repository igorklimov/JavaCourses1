public class HelloWorld {
    public static void main (String [] args) {
        String x = "Hello";
        String y = " World";
        System.out.println(x + y);
        int f = x.length();
        System.out.println("'Hello' contains of " + f + " letters");
        for(int i=1; i<=f; i++) {
            System.out.println(i);
            }
        for (int i = 0;i < x.length(); i++){
            int d = i + 1;
            System.out.println(d + " = " + x.charAt(i));
        }
    }
}


