package com.company;
//Created By: Dawson Funk
public class Main {

    public static void main(String[] args) {

        //Array objects
            //Circle cir[] = new Circle[500]
                //500 circle objects created under cir array
        //Used to pass circle object
            //cir [117] = new Circle [57.2]
                //Radius of 57.2

        //Initialize objects all at once
            /* for (int j = 0; j < 500; j++)
             {
                   cir[j] = new Circle(10);
             }

            */
        //500 circles all have radius of 10 above^^^

        //Compare array using numbers ==
            //if(n[23] == n[k + 1])
            //if(n[23] >= n[k + 1])

        //Crazy family member in data types ---> STRINGS
        //String arrays
            //if(s[3 + d].equals("hermit"))
            //if(s[3 + d].compareTo("hermit">0))
                //compareTo uses ASCII

        //Objects compared using .equals or .compareTo
            //if(BankAccount[1].equals(BankAccount[2]))

        //nullPointerException
            //double mxz[];
            //mxz[3] = 19.1; OH NO!
                //Must declare how many values are in array

        //int[] jawn = {1, 2, 3, 4, 5};
        //int[] sec;
        //sec = jawn;
        //sec[2] = 99;
        //SOP(jawn[2]);
            //OUTPUTS 99
            //Anything done to sec will change jawn, and VICE VERSA

        //Clear out indices from array
            //int myArray[] = new int[500];
            //myArray = null;
            //myArray[45] = 2003; THIS IS DUMB
                //Dumps all data out and acts as a kill switch
                //Cannot be used
            //YOU CAN SET ANY OBJECT TO NULL

        //Copying from array to array
            //System.arraycopy
                //MUST HAVE 5 PARAMETERS TO WORK
                //char ch [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
                //char nn [] = {'1', '2', '3', '4', '5', '6', '7', '8'};
                //System.arraycopy(ch, 1, nn, 2, 3)

        //Logical vs. Physical
            //int jk[] = new int[30];
            //int max = 5;
            // for(int j= 0; j<max; j++)
                //Physical 30
                //Logical 5

        //Array Class
            //import java.util.*

        //AP ONLY CARES ABOUT
            //Sort
                //sorts in alphabetical
            //Arrays.sort[*name of array*]

        //Enhanced for-loop (for-each loop)
            //Goes through every element in array
            //for(int varName: x)
                //int ---> type
                //varName ---> Dummy Name
                    //Cannot change its value
                //x ---> array




    }
}
