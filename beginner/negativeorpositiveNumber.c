#include <stdio.h>

int main(void) {
	// your code goes here
	long int i=100000;
	if(i>1 && i<10000){
		printf("The Given Value is Positive");
	}
	else if(i==0){
		printf("The Number is Neither Negative nor Positive");
	}
	else if(i>100000){
		printf("The Number is Greater than 100000");
	}
	else{
		printf("The Number Is Negative");
	}
	return 0;
}
