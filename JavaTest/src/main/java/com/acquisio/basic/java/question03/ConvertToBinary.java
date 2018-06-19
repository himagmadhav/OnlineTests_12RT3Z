package com.acquisio.basic.java.question03;

/**
 * QUESTION 03: ToBinary
 * Write a recursive function that allows converting a
 * integer number into a binary number.
 * For example, with the value 22, the method should return "10110"
 * <p>
 * If you need more classes, simply define them inline.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class ConvertToBinary {

    public static void main(String[] args) {
        ConvertToBinary instance = new ConvertToBinary();
        System.out.println(instance.convertToBinary(17));
    }

    private String convertToBinary(int val) {
        int binaryArray[]= new int[1000];
        int i=0;
        String str="";
        while(val>0){
            binaryArray[i]=val%2;
            val=val/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            str=str+Integer.toString(binaryArray[j]);
        }
        return  str; // TODO: Insert your code here.
    }
}
