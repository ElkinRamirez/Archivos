/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.io.*;
import java.util.Scanner;

public class FIle {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("slowly.txt");
         System.out.println("Existe: "+ f.exists());
        System.out.println("Longitud: "+f.length());
        File d=new File("juanpis");
        System.out.println("Existe Directorio: "+ d.exists());
        System.out.println("Directorio: "+d.isDirectory());
        File d2=new File("as");
       if(d2.exists()&& d2.isDirectory()){
            for (String nombre:d2.list()){
                System.out.println(nombre);
            }
        }
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ejercicio... ");
        
        Scanner input = (new Scanner(new File(("slowly.txt"))));
        int count=0;
        while(input.hasNext()){
            String word = input.next();
            count++;
        }
        System.out.println("total palbras: "+count);
    }
        
        
        
    
    
    
    }
