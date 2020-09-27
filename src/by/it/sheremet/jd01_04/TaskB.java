package by.it.sheremet.jd01_04;/*package jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String[] personArr=new String[n];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <=personArr.length-1; i++) {
            personArr[i]=scanner.nextLine();
        }
        // System.out.printf("%-15s%n",personArr[i]);

       // System.out.println();
        //System.out.println("imya "+personString[2]);
        int a=4;
        int Str=0;
        int Str1=0;
        int Str2=0;
        int Str3=0;
        int Str4=0;
        int Str5=0;
        double Str6=0;
        int[][] moneyArr=new int[personArr.length][a];
        Scanner scan=new Scanner(System.in);
       // for (int i = 0; i < personArr.length; i++) {
           // if (i==0){

                System.out.println("Введите зарплату для "+personArr[0]);
                moneyArr[personArr.length-2][a-1] =scan.nextInt();
           // }else if (i==1){
                    System.out.println("Введите зарплату для "+personArr[1]);
                    moneyArr[1][1]=scan.nextInt();
           // }else {
          //  } {
                        System.out.println("Введите зарплату для "+personArr[2]);
                        moneyArr[2][2]=scan.nextInt();


            //for (int c = 0; c < personArr.length; c++) {

                  //  System.out.println("Введите зарплату для "+personArr[i]);
             //   for (int b = 0; b < moneyArr[0].length; b++) {






                       //moneyArr[i][j]=i;
                         //moneyArr[c][b] = scan.nextInt();
                    Str=moneyArr[0][0]+moneyArr[0][1]+moneyArr[0][2]+moneyArr[0][3];
                    Str1=moneyArr[1][0]+moneyArr[1][1]+moneyArr[1][2]+moneyArr[1][3];
                    Str2=moneyArr[2][0]+moneyArr[2][1]+moneyArr[2][2]+moneyArr[2][3];
                    Str3=Str+Str1+Str2;
                    Str4=Str3/12;
                   // Str4=Str4*100;
                       //Str5 =Math.round(Str4);
                    //Str6=Str4/100;
               // }
          //  }
               // }
                    //}

               // System.out.print(Str);


       // }
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "фамилия", "1квартал", "2квартал", "3квартал", "4квартал","итого");
        System.out.printf("-------------------------------------------------------%n");
        System.out.printf("%-10s%-10d%-10s%-10s%-10s%-10s%n",personArr[0],moneyArr[0][0],moneyArr[0][1],moneyArr[0][2],moneyArr[0][3],Str);
        System.out.printf("%-10s%-10d%-10s%-10s%-10s%-10s%n",personArr[1],moneyArr[1][0],moneyArr[1][1],moneyArr[1][2],moneyArr[1][3],Str1);
        System.out.printf("%-10s%-10d%-10s%-10s%-10s%-10s%n",personArr[2],moneyArr[2][0],moneyArr[2][1],moneyArr[2][2],moneyArr[2][3],Str2);
        System.out.printf("-------------------------------------------------------%n");
        System.out.printf("%-10s%-10d%n","Итого",Str3);
        System.out.printf("%-10s%-10.4f%n","Средняя", Str4);
    }

    }
*/











