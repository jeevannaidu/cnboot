package Basics;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleRunnableAndCallable {

    static void callableExample() {
        Callable<Integer> addNumbers = () -> 11 + 10;

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(addNumbers);

        try {
            System.out.println("Result : " + result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            executorService.shutdown();
        }


    }
}
