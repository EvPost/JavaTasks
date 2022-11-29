package SqrEquation;

import java.util.Scanner;

import SqrEquation.IOTool;
import SqrEquation.SqrEqn;
import SqrEquation.SqrEqnException;

import java.io.IOException;

public class Main {
    public static void main(String[] args){

        double a,b,c;
        IOTool io = new IOTool();

        try{
            SqrEqn qadr1 = new SqrEqn(2,-6,4);
            qadr1.solution();
            qadr1.printRoots();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        try{
            SqrEqn qadr2 = new SqrEqn(1,2,3);
            qadr2.solution();
            qadr2.printRoots();
        }
        catch (DiscriminantEqnException e){
            e.printStackTrace();
        }

        try{
            SqrEqn qadr3 = new SqrEqn(0,2,3);
            qadr3.solution();
            qadr3.printRoots();
        }
        catch (SqrEqnException e){
            e.printStackTrace();
        }

        try{
            System.out.println("Input a,b,c");
            Scanner sc = new Scanner(System.in);
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("wrong input");
        }

        try{
            System.out.println("Input a,b,c");
            a=io.ReadDouble();
            b=io.ReadDouble();
            c=io.ReadDouble();

            SqrEqn qadr = new SqrEqn(a,b,c);
            qadr.solution();
            qadr.printRoots();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(SqrEqnException e){
            e.printStackTrace();
        }
    }
}
