//生成6个数字  1到33之间 ，创建一个集合，并且遍历集合

import java.util.ArrayList;
import java.util.Random;

public class notes{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        Random rm=new Random();
        for(int i=0;i<6;i++){
            int x=rm.nextInt(33)+1;  //rm.random(n)  产生0到n的伪随机数 不包括n
            a.add(x);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println(a);
        }

}