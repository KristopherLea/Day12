public class ControlFlow {


    public static String myMethod(int input){
       // int x = 3;
        if(input == 2) {
            return "true";
        } else {
            return "false";
        }
    }

    public String switchMethod(int input){
        switch (input){
            case 1:
                return "thats one.";

            case 2:
                return "thats two";
            case 3:
                System.out.println("you need a break");
                break;
            case 4:
                return "thats four";
            default:
                return "default";
        }
        return "other default idk";
    }

    public String forMethod() {

        int[] ints = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < 5; i++) {
            System.out.println("I am in a for loop.");
        }
        outer:
        for (int el : ints) {
            inner:
            //System.out.println(el);
            if (el == 3) {
                break inner;
            }
            System.out.println("I am after the continue.");
        }
        System.out.println("I am outside of the inner for loop");

        return "nothing";
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
       ControlFlow.myMethod(2);

       int x = 4;
//       while(x == 4){
//           System.out.println("hello");
//           x++;
//       }
       do{
           System.out.println("whats up everyone.");
       }while(x > 10);
    }
}
