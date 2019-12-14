package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File myFile = new File("text.txt");
        FileReader fr =new FileReader(myFile);
        Scanner scan =new Scanner(fr);

        String text=scan.nextLine();
        while(scan.hasNextLine()){
            text+=" ";
            text+=scan.nextLine();
        }
        System.out.println(text);
        char[] textn =text.toCharArray();
        for(int i=0; i<text.length();i++)
        {
            if(!Character.isLetter(textn[i])) {
                textn[i] = ' ';
            }
        }
        String textt=Character.toString(textn[0]);
        for(int i=1; i<textn.length;i++){
            textt+=textn[i];
        }
        textt.trim();
        int N=0;
        for(int i=0; i<textt.length()-1;i++) {
            if(Character.isLetter(textt.charAt(i))){
                if(Character.isWhitespace(textt.charAt(i+1))){N++;}
            }
        }
        String[] word=new String[N+1];
        int j=0, index1=0, index2=0;
        while(j<N+1){
            index2=textt.indexOf(" ", index1);
            if(index2<0){index2=textt.length();}
            if(index2-index1>0){
                word[j]=textt.substring(index1,index2);
                j++;
            }
            index1=index2+1;
        }
        //for (String words : word) System.out.println(words);

        for(int i=0; i<word.length;i++){
            for(int k=word.length-1;k>i;k--){
                if(word[k-1].compareToIgnoreCase(word[k])>0){
                    String x=word[k-1];
                    word[k-1]=word[k];
                    word[k]=x;
                }
            }
        }
        System.out.println("\n"+"After sorting"+"\n");
        for (String words : word) {
            System.out.println(words);
        }
        fr.close();
    }
}