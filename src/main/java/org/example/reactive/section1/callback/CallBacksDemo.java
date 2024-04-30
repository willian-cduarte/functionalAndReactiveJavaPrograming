package org.example.reactive.section1.callback;


public class CallBacksDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread is running");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                new CallBacksDemo().runningAsync(new CallBack() {

                    @Override
                    public void pushData(String data) {
                        System.out.println("CallBack data :" + data);
                    }

                    @Override
                    public void pushComplete() {
                        System.out.println("Callback done !");
                    }

                    @Override
                    public void pushError(Exception ex) {
                        System.out.println("Callback Error called, Got an Exception :" + ex);
                    }


                });
            }
        };

        Thread t = new Thread(r);
        t.start();
        Thread.sleep(2000);
        System.out.println("Main thread complete!");
    }

    public void runningAsync(CallBack callBack) {
        System.out.println("I am running in separate thread");
        sleep(1000);
        callBack.pushData("Data1");
        callBack.pushData("Data2");
        callBack.pushData("Data3");

        callBack.pushError(new RuntimeException("Oops!"));
        callBack.pushComplete();
    }

    private static void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
