 package com.example.project;


public class test {
public static void main(String[] args) {
//    String message = "HELLO";
//         int rows = 3;
        // String[][] expected = {
        //     {"H", "E"},
        //     {"L", "L"},
        //     {"O", "="}
        // };
      
        // Test case where message needs padding with "="
        String message = "HELLO";
        int rows = 4;
        String[][] expected = {
            {"H", "E"},
            {"L", "L"},
            {"O", "="},
            {"=","="}
        };
   
        // // Test case with an empty message
        // String message = "";
        // int rows = 2;
        // String[][] expected = {
        //     {"="},
        //     {"="}
        // };
 
        // // Test case where message fits exactly into the 2D array
        // String message = "HELLOWORLD";
        // int rows = 2;
        // String[][] expected = {
        //     {"H", "E", "L", "L", "O"},
        //     {"W", "O", "R", "L", "D"}
        // };

        for(int i=0;i<Encryptor.generateEncryptArray(message,rows).length;i++){
            for(int j=0; j<Encryptor.generateEncryptArray(message,rows)[0].length;j++){
System.out.print(Encryptor.generateEncryptArray(message,rows)[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<expected.length;i++){
            for(int j=0; j<expected[0].length;j++){
System.out.print(expected[i][j]);
            }
            System.out.println();
        }
    // System.out.println("result: " +Encryptor.determineColumns(0, rows));

}
    
}