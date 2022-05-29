import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("o.in");
        Scanner scanner = new Scanner(file);
        O[] arr = new O[scanner.nextInt()];
        int i;
        int j;
        int k;
        String l;
        for(int z = 0; z < arr.length; z++) {
            i = Integer.parseInt(scanner.next());
            j = Integer.parseInt(scanner.next());
            k = Integer.parseInt(scanner.next());
            l = scanner.next();
            arr[z] = new O(i, j, k, l);
        }
        System.out.println(arr[0].getCustomerName() + " took " + arr[0].serviceTime + " seconds.");
        int initTime = arr[0].getArrivalTime();
        int totalTime = arr[0].getServiceTime();
        for(int y = 1; y < arr.length; y++) {
            if(arr[y] != null) {
                int timeDiff = arr[y].getArrivalTime() - initTime;
                initTime = arr[y].getArrivalTime();
                totalTime += timeDiff;
                System.out.println(arr[y].getCustomerName() + " took " + totalTime + " seconds.");
            }
        }
    }
}
