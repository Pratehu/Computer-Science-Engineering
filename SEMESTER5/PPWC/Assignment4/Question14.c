#include<stdio.h>
int m = 25, n = 77;
char c = '*';
int *itemp;
/* describe the errors in each of the
following statements. */
m = &n;
itemp = m;
*itemp = c;
*itemp = &c;




//Statement         	Error	                          Correction
//m = &n;	        &n is an int * but m is an int.   	   m = n; or itemp = &n;.
//itemp = m;   	itemp is an int * but m is an int.	   itemp = &m;.
//*itemp = c; 	*itemp is an int but c is a char.	   *itemp = (int)c;.
//*itemp = &c;	&c is a char * but *itemp is an int.   Assign an integer to *itemp.