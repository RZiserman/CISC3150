//Author: Roman Ziserman

public class Thread2 extends Thread {
    char[] alpha_array = {'B', 'F', 'J', 'N', 'R', 'V', 'Z'};

    public void run() {
        for (int i = 0; i < 7; i++) {

            //to avoid OutOfBoundsException
            if (this.alpha_array.length < 7 && i > 5) {
                return;
            }

            checkPriority();

            checkOrResetCount();

            printCharacter(i);
        }
    }

    public synchronized void checkOrResetCount() {
        //reset the counter every 4 interations
        if (Counter.counter == 4) {
            Counter.counter = 1;
        } else {
            Counter.incrementCounter();
        }
    }//close checkOrResetCount()

    //check if the priority of this thread matches the counter. If it doesn't,
    //keep this thread asleep until it does.
    public synchronized void checkPriority() {
        while (this.getPriority() != Counter.counter) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } //close checkPriority()

    public synchronized void printCharacter(int num) {
        System.out.println(this.alpha_array[num]);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//close printCharacter()
}
