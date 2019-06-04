import java.util.Scanner;

public class FindMaxValueInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so hang ma tran: ");
        int rows = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        int cols = scanner.nextInt();

        float[][] matrix = new float[rows][cols];
        float max = matrix[0][0];
        int maxRows = 0;
        int maxCols = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhap vao gia tri cua ma tran tai vi tri [" + i + "][" + j + "]" );
                matrix[i][j] = scanner.nextFloat();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRows = i;
                    maxCols = j;
                }
            }
        }
        System.out.println("Gia tri lon nhat cua ma tran la: " + max + " tai vi tri [" + maxRows + "][" + maxCols+ "]");
    }
}
