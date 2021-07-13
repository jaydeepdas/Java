import org.graalvm.compiler.phases.common.ConditionalEliminationUtil.Marks;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class ArrayPracticeSet {
    public static void main(String args[])
    {
        //Paractice set 1 
        //Q. Create an array of 5 floats and calculate their Sum


       /* float[] Marks={45.7f, 64.3f, 25.3f ,36.4f ,78.2f};
        float sum=0;
        for(float element:Marks){
             sum=sum+element;
        }
        System.out.println("The value of sum is "+sum);
        

        //practice set 2
        //Write a program to find out whether a given integet is present in an array or not
 
        float[] Marks={45.7f, 64.3f, 25.3f ,36.4f ,78.2f};
        float num=36.4f;
        boolean isInArray=false;
        for(float element:Marks){
            if(num==element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
        System.out.println("The value is present in the array");
        }
        else
        {
        System.out.println("The value is not present in the array");
        }
        

        //parctice set 3

        //Calculate the average marks from an array containing marks of all
        //students in physics using for each loop.
        
        float[] Marks={45.7f, 64.3f, 25.3f ,36.4f ,78.2f};
        float sum=0;
        for(float element:Marks){
             sum=sum+element;
        }
        System.out.println("The value oof average marks "+sum/Marks.length);
        


        //parctice problem 4
        //create a java program to add two matrix of size 2x3;
        int [][] mat1={ {1,2,3},
                        {4,5,6}};
        int [][] mat2={{7,2,3},
                        {1,5,9}};
        int [][] result={{0,0,0},
                         {0,0,0}};
        for(int i=0;i<mat1.length; i++) //row number of time
        {
            for(int j=0;j<mat1[i].length;j++) //coloumn number of time
            System.out.format("settings vlaue for i=%d and j=%d\n", i,j);
            result[i][j]= mat1[i][j]+ mat2[i][j];
        }
        for(int i=0;i<mat1.length; i++) //row number of time
        {
            for(int j=0;j<mat1[i].length;j++) //coloumn number of time
            System.out.println(result[i][j]+ " ");
            result[i][j]= mat1[i][j]+ mat2[i][j];
        }
        System.out.println("");


        //practice set 5
        //write a java program to reverse array
        int[] arr={1,2,3,4,5,6};
        int l=arr.length;
        int n =Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<n;i++)
        {
            //swap a[i] and a[l-1-i]
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr)
        {
            System.out.print(element+" ");
        }

        
        //practice problem 6
        // Write a java progra, to find the maximum value in the array

        int[] arr={45,31,94,32,44,10,2};
        int max=0;
        for(int e:arr)
        {
            if(e>max)
            {
                max=e;
            }
        }
        System.out.println("the vlaue of the maxium elemts int this array is: "+max);
        
        //Practice set 7
        //Write a program to find the minimum value in the array

        int[] arr={45,31,94,32,44,11,2};
        int min=arr[0];
        for(int e:arr)
        {
                if(e<min)
                {
                    min=e;
                }
        }
        System.out.println("the vlaue of the minimum elemts int this array is: "+min);
        

        //Practice set 8
        //Write a java program to find whether an array is sorted or not
        boolean isSorted = true;
        int[] arr={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted =false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
        */
  
        
    }
}

