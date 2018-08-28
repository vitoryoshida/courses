package lambdaExpression.impl;

import lambdaExpression.FileFilter;

import java.io.File;

public class FirstLambda {

    public static void main(String[] args) throws InterruptedException {
        final FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean acept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        final FileFilter fileFilterLambda = (File file) -> file.getName().endsWith(".java");


        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(
                            "Hello world from thread [" +
                                    Thread.currentThread().getName() +
                                    "]"
                    );
                }
            }
        };

        final Runnable runnableLambda = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(
                        "Hello world from thread [" +
                                Thread.currentThread().getName() +
                                "]"
                );
            }
        };

        final Thread t = new Thread(runnableLambda);
        t.start();
        t.join();
    }
}
