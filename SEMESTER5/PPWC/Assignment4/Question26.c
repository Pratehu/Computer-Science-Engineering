#include <stdio.h>

void transposeMatrix(int *mat, int *transposed, int rows, int cols) {
    // Traverse the matrix using pointer arithmetic to transpose it
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            *(transposed + j * rows + i) = *(mat + i * cols + j);  // Transpose: swapping rows and columns
        }
    }
}

void printMatrix(int *mat, int rows, int cols) {
    // Print the matrix using pointer manipulation
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", *(mat + i * cols + j));
        }
        printf("\n");
    }
}

int main() {
    int rows, cols;
    
    // Input the dimensions of the matrix
    printf("Enter number of rows: ");
    scanf("%d", &rows);
    printf("Enter number of columns: ");
    scanf("%d", &cols);
    
    int mat[rows][cols];        // Original matrix
    int transposed[cols][rows]; // Transposed matrix (rows and cols swapped)
    
    // Input the elements of the matrix
    printf("Enter the elements of the matrix:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("Element[%d][%d]: ", i + 1, j + 1);
            scanf("%d", &mat[i][j]);
        }
    }
    
    // Transpose the matrix
    transposeMatrix(&mat[0][0], &transposed[0][0], rows, cols);
    
    // Print the original matrix
    printf("\nOriginal Matrix:\n");
    printMatrix(&mat[0][0], rows, cols);
    
    // Print the transposed matrix
    printf("\nTransposed Matrix:\n");
    printMatrix(&transposed[0][0], cols, rows);
    
    return 0;
}


//Output:
//Enter number of rows: 2
//Enter number of columns: 3
//Enter the elements of the matrix:
//Element[1][1]: 3  4 6 
//Element[1][2]: Element[1][3]: Element[2][1]: 3  7  6
//Element[2][2]: Element[2][3]:
//Original Matrix:
//3 4 6
//3 7 6

//Transposed Matrix:
//3 3
//4 7
//6 6