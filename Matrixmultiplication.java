public class Matrixmultiplication{
public static void main(String args[]){
int a[][]={{2,1,3},{4,5,2},{1,3,4}};
int b[][]={{4,2,3},{2,5,1},{2,2,1}};
int c[][]=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
c[i][j]=0;
for(int k=0;k<3;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.println(c[i][j]+"");
}
System.out.println();
}
}
}
