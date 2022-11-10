package day16multidimensionalarraysarraylists;

public class MultiDimensionalArray02 {

    //bir multidimensional Array'deki en buyuk ve ene kucuk elemanin toplamini veren kodu yaziniz
    public static void main(String[] args) {
        int arr[][]={{2,5,1},{83,75}};

        int maxElement= arr[0][0];
        int minElement= arr[0][0]-1;


        for (int[] w:arr){
            for (int k:w) {
                maxElement=Math.max(maxElement,k);
            }
            for (int a:w) {
                minElement=Math.min(minElement,a);

            }
        }
        System.out.println(maxElement);
        System.out.println(minElement);
        System.out.println("en buyuk ve en kucuk sayilarin toplami :"+(minElement+maxElement));

    }
}
