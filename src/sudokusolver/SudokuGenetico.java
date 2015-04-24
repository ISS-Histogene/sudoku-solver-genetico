/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class SudokuGenetico {
    private static int fixos;
    private static int no1 = 9;
    private static int no2 = 9;
    private static int no3 = 9;
    private static int no4 = 9;
    private static int no5 = 9;
    private static int no6 = 9;
    private static int no7 = 9;
    private static int no8 = 9;
    private static int no9 = 9;
    public SudokuGenetico(){
        
    }

    public static int[][] random(){
        int sudoku[][] = 
               {{1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,2,0,0,0,0,0},
                {0,0,0,0,0,4,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,7,0,0,0,0,0},
                {0,0,0,0,0,0,6,0,0},
                {0,0,3,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0}};

        Random rand = new Random();
        for(int x = 0; x<=8; x++){
            ArrayList<Integer> fixos = new ArrayList();
            fixos.add(1);
            fixos.add(2);
            fixos.add(3);
            fixos.add(4);
            fixos.add(5);
            fixos.add(6);
            fixos.add(7);
            fixos.add(8);
            fixos.add(9);
            for(int y = 0; y<=8; y++){
                if (sudoku[x][y]!=0){
                    fixos.remove((Integer) sudoku[x][y]);
                }
            }
            for(int y = 0; y<=8; y++){
                if (sudoku[x][y]==0){
                        sudoku[x][y] = fixos.get(rand.nextInt(fixos.size()));
                        fixos.remove((Integer) sudoku[x][y]);
                        }
                    }
                }
            
        
        for(int x = 0; x<=8; x++){
            System.out.println(Arrays.toString(sudoku[x]));
        }
        
    return sudoku; 
    }
    
    private static int conflitocoluna(int jogo[][]){
        int conflitos = 0;
        for(int z =0; z<=8;z++){
            for (int a=0; a<=7;a++){
                for (int b=a+1; b<=8;b++){
                    if(jogo[a][z]==jogo[b][z]){

                        conflitos++;
                    }
                }
            }
        }
        return conflitos;
    }
    
    private static void conflitobox(int jogo[][]){
        int conflitos = 0;
        int[] regiao10 = Arrays.copyOfRange(jogo[0], 0, 3);
        int[] regiao11 = Arrays.copyOfRange(jogo[1], 0, 3);
        int[] regiao12 = Arrays.copyOfRange(jogo[2], 0, 3);
        int[] regiao1 = new int[9];
        System.arraycopy(regiao10, 0, regiao1, 0, 3);
        System.arraycopy(regiao11, 0, regiao1, 3, 3);
        System.arraycopy(regiao12, 0, regiao1, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao1[a]==regiao1[b]){
                    conflitos++; 
                }
            }
        }
        

                
        int[] regiao20 = Arrays.copyOfRange(jogo[0], 3, 6);
        int[] regiao21 = Arrays.copyOfRange(jogo[1], 3, 6);
        int[] regiao22 = Arrays.copyOfRange(jogo[2], 3, 6);
        int[] regiao2 = new int[9];
        System.arraycopy(regiao20, 0, regiao2, 0, 3);
        System.arraycopy(regiao21, 0, regiao2, 3, 3);
        System.arraycopy(regiao22, 0, regiao2, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao2[a]==regiao2[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao30 = Arrays.copyOfRange(jogo[0], 6, 9);
        int[] regiao31 = Arrays.copyOfRange(jogo[1], 6, 9);
        int[] regiao32 = Arrays.copyOfRange(jogo[2], 6, 9);
        int[] regiao3 = new int[9];
        System.arraycopy(regiao30, 0, regiao3, 0, 3);
        System.arraycopy(regiao31, 0, regiao3, 3, 3);
        System.arraycopy(regiao32, 0, regiao3, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao3[a]==regiao3[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao40 = Arrays.copyOfRange(jogo[0], 0, 3);
        int[] regiao41 = Arrays.copyOfRange(jogo[1], 0, 3);
        int[] regiao42 = Arrays.copyOfRange(jogo[2], 0, 3);
        int[] regiao4 = new int[9];
        System.arraycopy(regiao40, 0, regiao4, 0, 3);
        System.arraycopy(regiao41, 0, regiao4, 3, 3);
        System.arraycopy(regiao42, 0, regiao4, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao4[a]==regiao4[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao50 = Arrays.copyOfRange(jogo[0], 3, 6);
        int[] regiao51 = Arrays.copyOfRange(jogo[1], 3, 6);
        int[] regiao52 = Arrays.copyOfRange(jogo[2], 3, 6);
        int[] regiao5 = new int[9];
        System.arraycopy(regiao50, 0, regiao5, 0, 3);
        System.arraycopy(regiao51, 0, regiao5, 3, 3);
        System.arraycopy(regiao52, 0, regiao5, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao5[a]==regiao5[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao60 = Arrays.copyOfRange(jogo[0], 6, 9);
        int[] regiao61 = Arrays.copyOfRange(jogo[1], 6, 9);
        int[] regiao62 = Arrays.copyOfRange(jogo[2], 6, 9);
        int[] regiao6 = new int[9];
        System.arraycopy(regiao60, 0, regiao6, 0, 3);
        System.arraycopy(regiao61, 0, regiao6, 3, 3);
        System.arraycopy(regiao62, 0, regiao6, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao6[a]==regiao6[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao70 = Arrays.copyOfRange(jogo[0], 0, 3);
        int[] regiao71 = Arrays.copyOfRange(jogo[1], 0, 3);
        int[] regiao72 = Arrays.copyOfRange(jogo[2], 0, 3);
        int[] regiao7 = new int[9];
        System.arraycopy(regiao70, 0, regiao7, 0, 3);
        System.arraycopy(regiao71, 0, regiao7, 3, 3);
        System.arraycopy(regiao72, 0, regiao7, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao7[a]==regiao7[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao80 = Arrays.copyOfRange(jogo[0], 3, 6);
        int[] regiao81 = Arrays.copyOfRange(jogo[1], 3, 6);
        int[] regiao82 = Arrays.copyOfRange(jogo[2], 3, 6);
        int[] regiao8 = new int[9];
        System.arraycopy(regiao80, 0, regiao8, 0, 3);
        System.arraycopy(regiao81, 0, regiao8, 3, 3);
        System.arraycopy(regiao82, 0, regiao8, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao8[a]==regiao8[b]){
                    conflitos++;
                }
            }
        }
        

            
        int[] regiao90 = Arrays.copyOfRange(jogo[0], 6, 9);
        int[] regiao91 = Arrays.copyOfRange(jogo[1], 6, 9);
        int[] regiao92 = Arrays.copyOfRange(jogo[2], 6, 9);
        int[] regiao9 = new int[9];
        System.arraycopy(regiao90, 0, regiao9, 0, 3);
        System.arraycopy(regiao91, 0, regiao9, 3, 3);
        System.arraycopy(regiao92, 0, regiao9, 6, 3);
        for(int a=0; a<=7;a++){
            for(int b=a+1; b<=8; b++){
                if (regiao9[a]==regiao9[b]){
                    conflitos++;
                }
            }
        }
        System.out.println(conflitos);
        

            
        
    }
    
    public static void main(String args[]){
        int jogo[][] = random();
        System.out.println(conflitocoluna(jogo));
        conflitobox(jogo);
    }
    
}
