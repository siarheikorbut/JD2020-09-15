package by.it.dobrodey.jd01_05;

import java.awt.Dimension;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestFrame extends JFrame {

    public static void createGUI(String [][] data, String name) {
        JFrame frame = new JFrame("Array "+ name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"1","2","3","4","5"};


        JTable table = new JTable(data,columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(500, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        int sizeA = 31;
        int [] arrA = new int[sizeA];
        int line = (int) (Math.ceil(sizeA/5.0));
        String [][]arrayA = new String[line ][5];
        for (int j = 0; j < sizeA; j++) {
                arrA[j] = (int) (Math.random()*(450-103))+103;}

        int indexArrA = 0;
        while(indexArrA<sizeA+4){
            if(indexArrA<sizeA){
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < 5; j++) {
                    arrayA[i][j]= "A["+Integer.toString(indexArrA)+"] = "+Integer.toString(arrA[indexArrA]);
                    indexArrA=indexArrA+1;
                }
            }}
            if(sizeA<indexArrA){}
            
        }


//        int sizeB = 0;
//        for (int i = 0; i < sizeA; i++) {
//            if ((double) i<(arrA[i]/10.0)){sizeB=sizeB+1;}
//        }
//        int sizeB1 = 20;
//        int[] arrB = new int[sizeB1];
//        int elementB = 0;
//        for (int i = 0; i < sizeA; i++) {
//            if ((double) i<(arrA[i]/10.0)){
//                arrB[elementB]=arrA[i];
//                elementB = elementB+1;
//            }
//
//        }
//        Arrays.sort(arrB);
////        int sizeB1 = 30;
//        int lineArrB = (int) (Math.ceil(sizeB1/5.0));
//        String [][]arrayB = new String [lineArrB][5];
//        for (int i = 0; i < lineArrB; i++) {
//            for (int j = i; j < sizeB1; j = j + lineArrB) {
//                arrayB[i][j]= "B["+Integer.toString(j)+"] = "+Integer.toString(arrB[j]);
//            }}

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI(arrayA, "A");
//                createGUI(arrayB, "B");
            }
        });
    }

}
