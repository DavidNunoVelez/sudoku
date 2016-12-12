package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int [][] tablero = new int[9][9];

    public static void inicializartablero(){
        tablero[0][0]=5;
        tablero[0][1]=3;
        tablero[0][4]=7;
        tablero[1][0]=6;
        tablero[1][3]=1;
        tablero[1][4]=9;
        tablero[1][5]=5;
        tablero[2][1]=9;
        tablero[2][2]=8;
        tablero[2][7]=6;
        tablero[3][0]=8;
        tablero[3][4]=6;
        tablero[3][8]=3;
        tablero[4][0]=4;
        tablero[4][3]=8;
        tablero[4][5]=3;
        tablero[4][8]=1;
        tablero[5][0]=7;
        tablero[5][4]=2;
        tablero[5][8]=6;
        tablero[6][1]=6;
        tablero[6][6]=2;
        tablero[6][7]=8;
        tablero[7][3]=4;
        tablero[7][4]=1;
        tablero[7][5]=9;
        tablero[7][8]=5;
        tablero[8][4]=8;
        tablero[8][7]=7;
        tablero[8][8]=9;
    }

    public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        inicializartablero();

        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9; j++) {
                System.out.format("%2d",tablero[i][j]);
            }
            System.out.println();
        }

    }
}
