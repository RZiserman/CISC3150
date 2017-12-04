//Author: Roman Ziserman

public class AlphabetSyncDriver {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new AlphabetSync(new char[] {'A', 'E', 'I', 'M', 'Q', 'U', 'Y'} , 10));
        Thread thread2 = new Thread(new AlphabetSync(new char[] {'B', 'F', 'J', 'N', 'R', 'V', 'Z'} , 30));
        Thread thread3 = new Thread(new AlphabetSync(new char[] {'C', 'G', 'K', 'O', 'S', 'W'}, 50));
        Thread thread4 = new Thread(new AlphabetSync(new char[] {'D', 'H', 'L', 'P', 'T', 'X'} , 70));

        //Each of these "priorities" represent a row of the character arrays
        //in the given problem
        thread1.setPriority(1);
        thread2.setPriority(2);
        thread3.setPriority(3);
        thread4.setPriority(4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
