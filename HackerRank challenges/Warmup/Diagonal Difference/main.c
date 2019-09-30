#include <math.h>
#include <stdio.h>

int diagonalDifference(int[100][100], int);

int main() {
  int n;
  int arr[100][100];
  int i, j;
  int result;
  scanf("%d", &n);

  for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
      scanf("%d", &arr[i][j]);
    }
  }

  result = diagonalDifference(arr, n);
  printf("%d", result);
  return 0;
}

int diagonalDifference(int a[100][100], int n) {
  int difference;
  int i, j;
  int firstDiagonal = 0;
  int secondDiagonal = 0;

  for (i = 0; i < n; i++) {
    firstDiagonal += a[i][i];
  }

  for (i = 0, j = n - 1; i < n; i++, j--) {
    secondDiagonal += a[i][j];
  }

  difference = abs(firstDiagonal - secondDiagonal);
  return difference;
}
