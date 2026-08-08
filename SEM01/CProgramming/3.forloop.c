#include <stdio.h>

int main(){
	int i;
	// using forloop 
	for(i = 0;i<=2;i++){
		printf("\n%d\n", i);
	}

	// without initating n

	// for(n=0;n<=0;n++){
	// 	printf("\n%d\n", n);
	// }


	printf("\n\n************************\n************************\n\n");



	// without initiation : 
	int x = 1;
	for(;x<5;x++){
		printf("x is %d \n",x);
	}
	// works fine.


	printf("\n\n************************\n************************\n\n");

	// without condition checking 

	// int k = 1;
	// for(k;;k++){
	// 	printf("%d",k);
	// }

	// infinite loop.



	// no incrementation

	int navu = 1;
	for(navu;navu < 10; ){
		printf("%d",navu);
	}


}
