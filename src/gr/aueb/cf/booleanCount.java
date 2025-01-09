package gr.aueb.cf;

public class booleanCount {
    public static void main(String[] args) {
        boolean[] array = {true, false, false, true, false};

        System.out.println(countTrue(array));
    }
    public static int countTrue(boolean[] arr){

        int count = 0;

        for(int i=0; i < arr.length; i++){

            if(arr[i] == true){

                count++;}

        }

        return count;

    }
}
