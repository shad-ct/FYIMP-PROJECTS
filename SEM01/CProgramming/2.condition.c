#include <stdio.h>

int main(){
	int num = 10;
	// checking if num = 10
	if(num == 10)
		printf("num is 10");
	
	else 
		printf("num is not 10");
	

	// switch case : 

	int choice = 2;

	switch (choice){
		case 1:
			printf("case 01");
			break;
		case 2:
			printf("case 02");
			break;
		default:
			printf("Default");
	}
}
