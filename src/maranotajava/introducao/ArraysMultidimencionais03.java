package maranotajava.introducao;

public class ArraysMultidimencionais03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        for(int[] arrBase: arrayInt){
            System.out.println("-----");
            for(int num : arrBase){
                System.out.println(num);
            }
        }

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {4,5,6,7}};
        for(int[] arrBase: arrayInt2){
            System.out.println("----------");
            for(int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
