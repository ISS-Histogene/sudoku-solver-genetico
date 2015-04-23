/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class SudokuGenetico {
    private static SudokuInterface tela;
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

    public static void jogo(String[][] matriz, SudokuInterface inter){
        tela = inter;
        for(int a=0; a<=8;a++){
            for(int b=0; b<=8;b++){
                if(!(matriz[a][b].equals(""))){
                    fixos++;
                    if(matriz[a][b]=="1"){
                        no1--;
                    }
                    else if(matriz[a][b]=="2"){
                        no2--;
                    }
                    else if(matriz[a][b]=="3"){
                        no3--;
                    }
                    else if(matriz[a][b]=="4"){
                        no4--;
                    }
                    else if(matriz[a][b]=="5"){
                        no5--;
                    }
                    else if(matriz[a][b]=="6"){
                        no6--;
                    }
                    else if(matriz[a][b]=="7"){
                        no7--;
                    }
                    else if(matriz[a][b]=="8"){
                        no8--;
                    }
                    else if(matriz[a][b]=="9"){
                        no9--;
                    }
                }

            }
        }
        int vazios = 81 - fixos;
        int[] posicoes = new int[vazios];
        Random rand = new Random();
        for(int x = 0; x < vazios; x++){  
            int randomNum = rand.nextInt(8)+1;
            if(randomNum==1){
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 2) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 3) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 4) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 5) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 6) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 7) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 8) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            } else if (randomNum == 9) {
                if(no1 > 0){
                    no1--;
                    posicoes[x] = randomNum;
                }
            }
        }
            
    }
    
}
