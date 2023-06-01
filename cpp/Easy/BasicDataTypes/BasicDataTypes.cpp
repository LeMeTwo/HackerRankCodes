#include <iostream>
#include <cstdio>
using namespace std;

//Input consists of the following space-separated values: int, long, char, float, and double, respectively.
//Print each element on a new line in the same order it was received as input. Note that the floating point value should be correct up to 3 decimal places and the double to 9 decimal places.
   

int main() { 
    int i;
    long l;
    char c;
    float fl;
    double d;
    scanf("%d %ld %c %f %lf", &i, &l, &c, &fl, &d);
    printf("%d\n%ld\n%c\n%f\n%lf", i, l, c, fl, d);

    return 0;
}