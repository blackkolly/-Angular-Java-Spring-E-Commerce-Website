package MyArray;

public class ArrayDemo {
    public static void main(String[] args){
        int LikeArray[];
        LikeArray = new int[7];
        LikeArray[0] = 100;
        LikeArray[1] = 200;
        LikeArray[2] = 300;
        LikeArray[3] = 4500;
        LikeArray[4] = 1010;
        LikeArray[5] = 1009;
        LikeArray[6] = 1200;
        for(int i = 0; i < LikeArray.length;i++) {
            System.out.println("The element of the index " + i + " is equal to:" + LikeArray[i]);
        }
        //System.out.println("The element at index 1 :" + LikeArray[1]);
        //System.out.println("The element at index 2 :" + LikeArray[2]);
    }
}
