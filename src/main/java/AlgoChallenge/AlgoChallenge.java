package AlgoChallenge;

public class AlgoChallenge {
    public static void main(String[] args) {

        int[] array1 = {3,0,6,2,0,9,8,1,8,0};
        int[] array2 = {9,1,0};

        int index1 = 0;
        int index2 = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if (array2[index2] == array1[index1]) {
                index2++;
            }
            index1++;
        }

        System.out.println(index2 == array2.length ? "In Sequence" : "Not in sequence");

    }
}
