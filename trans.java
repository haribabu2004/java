public class trans {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int[][] mat1=new int[2][2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat1[i][j]=mat[j][i];
                System.out.print(mat1[i][j]);
            }
            System.out.println();
        }
    }
}
