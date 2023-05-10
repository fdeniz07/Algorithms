package BigO;


// Array ne kadar büyük olursa olsun, algoritmanin calistirilma süresi hap sabit kalacaktir.

public class O1 { // 0(1) --> Constant Complexity


    public static void main(String[] args) {

        int[] arr = {10, 2, 5, 34, 56};
        //Array'in son elemanini ekrana yazdirin
        System.out.println(arr[arr.length - 1]);

    }
}
