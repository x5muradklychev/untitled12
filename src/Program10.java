public class Program10 {
    public static void main(String[] args) {

        int[] array = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int swapCount = 0;
        int lastIndex = array.length-1;
        for(int i = lastIndex-1; i >=0; i--) {
            if(array[i] == 0) {
                array[i] = array[lastIndex-swapCount];
                array[lastIndex-swapCount] = 0;
                swapCount++;
            }
        }
        for(int i : array) {
            System.out.print(i + ", ");
        }
    }
}
