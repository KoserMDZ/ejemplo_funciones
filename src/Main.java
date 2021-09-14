public class Main {

    public static void main(String[] args) {
        function3();
        System.out.println("Esta línea se ejecuta en tercer lugar");
        function2();
        function1();
    }

    public static void function1(){
        System.out.println("Esta línea se ejecuta en primer lugar");

    }

    public static void function2(){
        System.out.println("Esta línea se ejecuta en segundo lugar");
    }

    public static void function3(){
        System.out.println("Esta línea se ejecuta en cuarto lugar");
    }

}

