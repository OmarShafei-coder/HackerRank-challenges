#include <stdio.h>
/*
sense we cannot return an array in C, we can pass it as an argument or make an array using dynamic memory allocation
malloc() func.
*/
void plusMinus(double[3], int n); 

int main(void) 
{
    int i; //loop counter;
    int n; //number of elements
    double result[3];

    scanf("%d",&n);
    plusMinus(result, n);

    for(i=0; i<3; i++){
        printf("%lf\n",result[i]);
    }
    printf("\n");
    return 0;
}

void plusMinus(double result[3], int n){
    int i; //loop counter
    int arr[100];
    int positive = 0;
    int negative = 0;
    int zeros = 0;

    for(i=0; i<n; i++){
        scanf("%d",&arr[i]);
        if(arr[i] > 0){
            positive++;
        } 
        else if(arr[i] < 0){
            negative++;
        }
        else{
            zeros++;
        }
    }

    result[0] = (double) positive / n;
    result[1] = (double) negative / n;
    result[2] = (double) zeros / n;
}