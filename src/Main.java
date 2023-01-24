import com.it_academy.homework_1.Homework1;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 0, 0, 0, 0},
                {4, 5, 0, 0, 0},
                {7, 4, 3, 0, 0},
                {1, 2, 3, 4, 0},
                };

        System.out.println(Homework1.isLowerTriangularMatrix(matrix));
    }
}