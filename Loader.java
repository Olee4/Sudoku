import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Loader {
    String path = "ressources/SUDOKU.csv";
    List<List<Integer>> getSudokuToSolve = readCSV(path);

    public Loader() throws FileNotFoundException {
    }

    List<List<Integer>> readCSV(String path) throws FileNotFoundException {
        String csvSeparator = ",";
        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            String line;
            List<List<Integer>> board = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                List<Integer> row = new ArrayList<>();
                String[] row_str = line.split(",");

                for (String s : row_str) {
                    row.add(Integer.parseInt(s));
                }
                board.add(row);
            }
            return board;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }
    }
}