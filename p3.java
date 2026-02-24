public class P3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;

        for(int x : arr){
            sum += x;
        }

        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }
}