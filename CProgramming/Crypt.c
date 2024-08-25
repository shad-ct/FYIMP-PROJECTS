#include <stdio.h>
#include <string.h>

void encrypt(char *msg, int pass) {
	for (int i = 0; i < strlen(msg); i++) {
		msg[i] = (msg[i] + pass) % 256;
	}
	printf("Encrypted message: ");
	for (int i = 0; i < strlen(msg); i++) {
		printf("%c", msg[i]);
	}
	printf("\n");
}

void decrypt(char *msg, int pass) {
	for (int i = 0; i < strlen(msg); i++) {
		msg[i] = (msg[i] - pass + 256) % 256;
	}
	printf("Decrypted message: ");
	for (int i = 0; i < strlen(msg); i++) {
		printf("%c", msg[i]);
	}
	printf("\n");
}

int main() {
	int choice, pass;
	char msg[100];
	printf("Enter your choice : \n");
	printf(" 1. ENCRYPT \n 2. DECRYPT \n");
	printf("Enter your choice : ");
	scanf("%d", &choice);
	switch (choice) {
	case 1:
		printf("\nEnter the message to Encrypt : ");
		scanf("%s", msg);
		printf("Enter your password (integer): ");
		scanf("%d", &pass);
		encrypt(msg, pass);
		break;
	case 2:
		printf("Enter the message to Decrypt : ");
		scanf("%s", msg);
		printf("Enter your password (integer): ");
		scanf("%d", &pass);
		decrypt(msg, pass);
		break;
	default:
		printf("Invalid choice\n");
		break;
	}
}
