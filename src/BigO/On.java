package BigO;

// Elimizdeki veri seti arttikca, algoritmanin calistirilma süresi dogru orantili sekilde artis gösterir.

public class On { // 0(n) --> Linear Complexity

    public static void main(String[] args) {

        // Array'in bütün elemanlarini ekrana basalim

        int[] arr = {21, 3, 4, 9, 11, 74, 44};

        for (int item : arr) {
            System.out.println(item + " ,");
        }
    }
}
