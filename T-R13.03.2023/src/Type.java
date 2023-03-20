public class Type {
    public static void main(String[] args) {
        byte byteVar = 8;
        int intVar = 1648;
        double doubleVar = 9.13;
        float floatVar = 56938845;

        byteVar = (byte) intVar;
        doubleVar = (double) floatVar;



        System.out.println("После сужения из int в byte наше число стало: " + byteVar);

        System.out.println("После сужения из float в double наше число стало: " + doubleVar);

        byte byteVar1 = 8;
        int intVar1 = 1648;
        double doubleVar1 = 9.13;
        float floatVar1 = 56938845;

        int intVar2 = byteVar1;
        double doubleVar2 = floatVar1;

        System.out.println("После рассширения из int в byte наше число стало: " + "byte " +  intVar2);
        System.out.println("После рассширения из double в float наше число стало: " + "float " + doubleVar2);


    }
}
