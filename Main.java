import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Loader loader = new Loader();

        int[][] sudo = loader.getSudokuToSolve.stream()
                .map(list -> list.stream().mapToInt(i -> i).toArray())
                .toArray(int[][]::new);

        for (int i = 0; i < sudo.length; i++) {
            for (int j = 0; j < sudo[i].length; j++) {
                System.out.print(sudo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        boolean bool = new SudoSolver().solve(sudo);
        if (bool) {
            for (int i = 0; i < sudo.length; i++) {
                for (int j = 0; j < sudo[i].length; j++) {
                    System.out.print(sudo[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ungültige Vorgabe");
        }
    }
}
