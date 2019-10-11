package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hero Hero1 = new Hero();
        Hero1.health = 250;
        Hero1.Attak = 20;
        Hero1.AttakType = 1;

        Hero Hero2 = new Hero();
        Hero2.health = 250;
        Hero2.Attak = 20;
        Hero2.AttakType = 2;

        Hero Hero3 = new Hero();
        Hero3.health = 250;
        Hero3.Attak = 20;
        Hero3.AttakType = 3;

        Hero Hero4 = new Hero();
        Hero4.health = 250;
        Hero4.Attak = 20;
        Hero4.AttakType = 4;

        Boss boss = new Boss();
        boss.sethealth(700);
        boss.setAttak(50);
        boss.setProtectiontype(0);
    }
}