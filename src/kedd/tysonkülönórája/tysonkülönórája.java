package kedd.tysonkülönórája;

public class tysonkülönórája {
    public static void main(String[] args){
        int[][] tömb = new int[2][3];
        int[][] matrix = {{1,2,5},{3,4,6},{7,8,9}};
        int[][][] haromd = {{{1,2},{3,4},{5,6}},
                            {{1,2},{3,4},{5,6}},
                            {{1,2},{3,4},{5,6}}};
        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        String[][] yoolo = {{"asd","hada","yolo"},{"juli","ruti","mcvb"},{"val","fugi","duki"}};
        for (int i =0; i<yoolo.length;i++){
            for(int j=0;j<yoolo[i].length;j++){
                System.out.print(yoolo[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0; i<haromd.length;i++){
            for(int j=0;j<haromd[i].length;j++){
                for (int k=0;k<haromd[i][j].length;k++) {
                    System.out.print(haromd[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }



    }
}
