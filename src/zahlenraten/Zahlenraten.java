/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahlenraten;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ForouzanShebli
 */
public class Zahlenraten {
      private static Random rg;

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner con = new Scanner(System.in);
            rg = new Random(0);//Zufallszahlen Generator
            int minZahl = 0, maxZahl = 0;
            int rz=0, minz=0, maxz=0, zahl=0;
            boolean gefunden;
            String eingabe = ""; //
            //-------->
            System.out.println("Bitte Intervall-Untergrenze eingaben:");
            minZahl = con.nextInt();
            System.out.println("Bitte Intervall-Obergrenze eingaben:");
            maxZahl = con.nextInt();
            if (minZahl>maxZahl) {
                  int temp = minZahl;
                  minZahl = maxZahl;
                  maxZahl = temp;
            }
            do{
            gefunden = false;
            rz = rg.nextInt(maxZahl-minZahl)+minZahl;
            //System.out.println("" +minZahl + ":" + maxZahl+":"+rz);
            minz = minZahl;
            maxz = maxZahl;
            do {
                  System.out.println("Raten Sie eine Zahl zwischen " + 
                            minz + " und " + maxz);
                  zahl = con.nextInt();
                  if(zahl == rz){
                        gefunden = true;
                  }else{
                        if(zahl > rz){
                              System.out.println("Zahl zugroß!");
                        }else{
                              System.out.println("Zahl zuklein!");
                        }
                  }
            } while (!gefunden);
            System.out.println("Die gesuchte Zahl war: " + zahl);
            System.out.println("Soll das Spiel wiederholt werden (j/n)?");
            eingabe = con.nextLine();
            eingabe = con.nextLine();
//            for (int i=0;i<100;i++){
//                  System.out.println(i+":"+rg.nextInt(100)+1);
//            }
            }while(eingabe.equals("j"));
            
      }
            }

