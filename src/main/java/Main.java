import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        if (args.length > 0) {
            System.out.println("Hello " + args[0] + "!");
        } else {
            System.out.println("Hello stranger!");
        }

        Thread.sleep(3000);
    }
}
