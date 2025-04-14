package LABTUAN2;
import java.util.Scanner;
public class Bai01{
    public static int[]nhapmang (int n){
        Scanner sc = new Scanner (System.in);
        int[] mang = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i=0; i<n; i++){
            System.out.println("Phan tu thu " +(i+1)+":");
            mang[i]= sc.nextInt();
        }
        return mang;
    }
    public static void xuatmang(int[] mang){
        System.out.println("Mang da nhap: ");
        for(int num : mang) {
            System.out.print(num+" ");
        }
    }
    public static int timvitri(int[]mang,int x) {
        for (int i=0; i< mang.length; i++){
            if (mang[i]== x){
                return i+1;
            }
        }
        return 0;
    }
    public static int timgiatrilonnhat(int[]mang){
            int max = mang[0];
            for (int num:mang){
                if(num>max){
                    max = num;
                }
        }
            return max;
    }
    public static int timgiatrinhonhat(int[]mang){
            int min = mang[0];
            for (int num:mang){
                if(num<min){
                    min = num;
                }
        }
            return min;
    }
    public static int timvitrilonnhat(int[]mang){
        int vtln = 0;
        for (int i = 1; i<mang.length; i++){
            if (mang[i]>mang[vtln]){
                vtln = i;
            }
        }
        return vtln+1;
    }
    public static void sapxepmang(int[]mang){
        int n=mang.length;
        for (int i =0; i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (mang[j]>mang[j+1]){
                    int temp = mang[j];
                    mang[j]=mang[j+1];
                    mang[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print ("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[]mang =nhapmang(n);
        xuatmang(mang);
        System.out.println("Nhap so x can tim vi tri: ");
        int x= sc.nextInt();
        int vitri = timvitri(mang,x);
        if (vitri !=0){
            System.out.println("Vi tri cua so "+x+" trong mang la: " +vitri);
        } else{
            System.out.println("So "+x+" khong co trong mang");
        }
        int giatrilonnhat = timgiatrilonnhat(mang);
        System.out.println("Gia tri lon nhat trong mang la: "+giatrilonnhat);
        int giatrinhonhat = timgiatrinhonhat(mang);
        System.out.println("Gia tri lon nhat trong mang la: "+giatrinhonhat);
        int vitrilonnhat = timvitrilonnhat(mang);
        System.out.println("Vi tri cua phan tu lon nhat trong mang: "+vitrilonnhat);
        sapxepmang(mang);
        System.out.println("Mang sau khi sap xep tang dan: ");
        xuatmang(mang);
    }
}