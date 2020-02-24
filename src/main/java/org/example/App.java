package org.example;
//import org.example.SICI.*;
import org.example.HouseCost.*;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
//        SimpleInterest si = new SimpleInterest(10,2,5);
//        CompoundInterest ci = new CompoundInterest(10,2,5);
//        System.out.println(ci.calculate());
        int type;
        double area;

        Scanner scan=new Scanner(System.in);
        System.out.format("%s","Enter value For Construction type : \n");
        System.out.format("%s","Press 1 - Standard Type\n");
        System.out.format("%s","Press 2 - Above Standard Type\n");
        System.out.format("%s","Press 3 - High Standard Type\n");
        System.out.format("%s","Press 4 - High Standard Type + Automation \n");
        type=scan.nextInt();
        System.out.format("%s","Enter House Area \n");
        area=scan.nextDouble();
        scan.close();

        HouseCostFun c=new HouseCostFun(type, area);
        System.out.println(c.calculateTotalCost());
    }
}
