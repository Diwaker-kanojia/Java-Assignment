//  6) Display those numbers from array x that has atleast one multiple in array y
public class AtleatOneMultiple {

    public static void printAtleastOneMultiple(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean foundMultiple = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] % arr2[j] == 0) {
                    foundMultiple = true;
                    break;
                }
            }
            if (foundMultiple) {
                System.out.print(arr1[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] x = { 10, 24, 45, 22, 11, 87, 6 };
        int[] y = { 12, 90, 33, 80 };
        printAtleastOneMultiple(x, y);
    }
}
