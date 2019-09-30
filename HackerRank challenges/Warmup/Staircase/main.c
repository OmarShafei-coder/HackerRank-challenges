#include <stdio.h>

int main(void)
{
    
    int star, space;
    int i; //loop counter
    int n;

    printf("Please enter the number of lines : ");
    scanf("%d",&n);

    for(i=1; i<=n; i++)
    {
        for(space=1; space<=n-i; space++)
        {
            printf(" ");
        }
        for(star=1; star<=i; star++)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}