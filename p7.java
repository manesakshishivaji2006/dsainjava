public class P7 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 2};
        int key = 9;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Not Found");
    }
}