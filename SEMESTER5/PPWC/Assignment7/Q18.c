/*
planet_t p1;
planet_t *ptr = &p1;

strcpy(ptr->name, "jupiter");
ptr->diameter = 142.34;
ptr->moons = 16;
ptr->or_time = 11.9;
ptr->ro_time = 9.23;

Complete program:

#include <stdio.h>
#include <string.h>

typedef struct {
    char name[30];
    double diameter;
    int moons;
    double or_time, ro_time;
} planet_t;

int main() {
    planet_t p1;
    planet_t *ptr = &p1;

    strcpy(ptr->name, "jupiter");
    ptr->diameter = 142.34;
    ptr->moons = 16;
    ptr->or_time = 11.9;
    ptr->ro_time = 9.23;

    printf("%s %.2lf %d %.2lf %.2lf\n",
           ptr->name,
           ptr->diameter,
           ptr->moons,
           ptr->or_time,
           ptr->ro_time);

    return 0;
}
    */