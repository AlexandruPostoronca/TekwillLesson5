import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberN = scanner.nextInt();
        int nSquares = 1;
        int resultsSquares =nSquares * nSquares ;

        while (resultsSquares <= numberN) {
            System.out.println(resultsSquares);
            ++nSquares;
            resultsSquares = nSquares * nSquares;
        }
    }
}