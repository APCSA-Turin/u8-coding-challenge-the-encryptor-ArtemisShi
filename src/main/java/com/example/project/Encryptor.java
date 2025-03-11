package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Encryptor {
    
    public static int determineColumns(int messageLen, int rows){
        int col=messageLen/rows;
        if(messageLen%rows!=0){
            col=(messageLen/rows)+1;
        }
        if(messageLen==0){
            col=1;
        }
        return col;
    }
    
    public static String[][] generateEncryptArray(String message, int rows) {
        int count=0;
        String[][] encrypt= new String[rows][determineColumns(message.length(), rows)];
        for(int i=0; i<encrypt.length;i++){
            for(int j=0; j<encrypt[0].length;j++){
                if(count<message.length()){
                encrypt[i][j]=message.substring(count,count+1);
                count++;
                }
                else{
                    encrypt[i][j]="=";
                }
            }
        }
        return encrypt;
    }

    public static String encryptMessage(String message, int rows){
       String[][] encrypt=generateEncryptArray(message, rows);
        String mess="";
        for(int i=encrypt[0].length-1;i>=0;i--){
            for(int j=0; j<encrypt.length;j++){
                mess+=encrypt[j][i];
            }
        }
        return mess;
    }

    public static String decryptMessage(String encryptedMessage, int rows) {
        if(encryptedMessage.length()%rows==0){
        String[][] dec= new String[rows][determineColumns(encryptedMessage.length(), rows)];
        int count =0;

        

        for(int i=dec[0].length-1;i>=0;i--){
            for(int j=0; j<dec.length;j++){
                dec[j][i]=encryptedMessage.substring(count, count+1);
                count++;
            }
        }

        String mes="";

        for(int i=0;i<dec.length;i++){
            for(int j=0; j<dec[0].length;j++){
                if(!dec[i][j].equals("=")){
                mes+=dec[i][j];
                }
            }
        }
    
        return mes;
    }
    else{
        return encryptedMessage;
    }
}
}