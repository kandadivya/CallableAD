import java.util.concurrent.Callable;

public class Main implements Callable<Integer> {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    @Override
    public Integer call() throws Exception {
        return null;
    }
}