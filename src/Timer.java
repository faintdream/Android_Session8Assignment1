/*
 In this program we make use of thread class and print message  prior to every sleep 
 occurence 
 */
class Timer extends Thread {   // defining Timer calss using Thread class as super class

    public void run() {        //  overriding run method declared in Thread class
        
        for (int i = 1; i < 10; i++) {  // loop i 10 times 
            try {                                   // try block
                System.out.println("Time out");     // print a generic time out message 
                Thread.sleep(10000);                // put the thread to sleep for 10 seconds
                
            } catch (InterruptedException e) {          // catch block
                System.out.println(e);
            }

        }
    }

    public static void main(String args[]) {            // main block
        Timer objT1 = new Timer();                         //defining object of Timer class
        objT1.start();                                     // t1 calling start method defined in Thread class

    }
}
