package test;
import java.util.Arrays;
//每轮将最大的放在最后
public class MaoPaoJingDian {

    public static void main(String[] args) {
        int[] ary = new int[]{78,45,98,23,55,12};
        MaoPaoJingDian.sorth(ary);
        System.out.println(Arrays.toString(ary));
    }
    public static void sorth(int[] ary){
        for(int i=0;i<ary.length-1;i++){
            for(int j=0;j<ary.length-i-1;j++){
                if(ary[j]>ary[j+1]){
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }
          System.out.println("第"+(i+1)+"次排序："+Arrays.toString(ary));
            }
        }
    }
}