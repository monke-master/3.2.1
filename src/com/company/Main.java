package com.company;

import java.io.FileInputStream;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
      try {
         compare("C:\\Users\\Игорь\\jP\\untitled\\src\\com\\company\\1.txt", "C:\\Users\\Игорь\\jP\\untitled\\src\\com\\company\\2.txt");
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
    static void compare(String file1Name, String file2Name) throws IOException {
        FileInputStream file1 = new FileInputStream(file1Name);
        FileInputStream file2 = new FileInputStream(file2Name);
        int k = 0;
        int a, b;
        while (((a = file1.read()) != -1) && ((b = file2.read()) != -1)) {
            k++;
            if (a != b) {
               System.out.println(k + " ые символы не равны: " + (char)a + " " + (char)b);
            }
        }
    }
}
