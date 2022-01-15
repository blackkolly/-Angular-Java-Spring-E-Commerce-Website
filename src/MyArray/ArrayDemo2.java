package MyArray;

public class ArrayDemo2 {
    public static void main(String[] args){
        //Declare the string array
        String WordArray[];
        //Declaration with array size
        WordArray = new String[5];
        //initialize the array variable
        WordArray[0] = "Kola";
        WordArray[1] = "Emeka";
        WordArray[2] = "Nicolas";
        WordArray[3] = "Leye";
        WordArray[4] = "Taiwo";
        //display the array element
        for (int i = 0;i< WordArray.length;i++){
            System.out.println("The technical team are: " + WordArray[i]);
        }

    }
}
