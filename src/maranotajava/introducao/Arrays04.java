package maranotajava.introducao;

public class Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[]{5,4,3,2,1};
        int[] numeros2 = {1,2,3,4,5};
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("");

        for(int num : numeros2){
            System.out.println(num);
        }

    }
}
