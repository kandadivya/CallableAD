import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main implements Callable<Integer> {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable<Integer> callable = new Main();
        Integer resultingInteger = new Integer(0);
        for(int i=0; i< 100; i++) {
            Future<Integer> future = executor.submit(callable);
            resultingInteger += future.get();
        }

        executor.shutdown();

        System.out.println("The final answer: "+resultingInteger);
    }

    @Override
    public Integer call() throws Exception {
        Integer fin = new Integer(0);
        for(int i = 0; i < 1000000; i++)
        {
            fin++;
        }
        return fin;
    }

}