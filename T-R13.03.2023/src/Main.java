import javax.tools.JavaCompiler;

public class Main {
    public static void main(String[] args) {
        //             0123456789  101112131415161718
        //             I study B a s i c   J a v a !
        String text = "I study Basic Java!";
        System.out.println(text);
        char result = text.charAt(18);
        System.out.println(result);
        System.out.println("Java: " + text.contains("Java"));
        String result2 = text.replace("a", "o");
        System.out.println(result2);
        String result3 = text.toUpperCase();
        System.out.println(result3);
        String result4 = text.toLowerCase();
        System.out.println(result4);
        String result5 = text.substring(0, 14);
        String result6 = text.substring(18);
        System.out.println(result5 + result6);


    }
}