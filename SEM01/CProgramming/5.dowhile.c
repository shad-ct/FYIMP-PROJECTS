#include <stdio.h>

int main (){
    int i = 0;


    // do{
    //     printf("hello from do while!");
    // }
    // while(i = 10);
    // another infite loop


    do{
        i = i++;
        printf("*******%d***",i);
        
    }
    while(i==5);
    return 0;
}