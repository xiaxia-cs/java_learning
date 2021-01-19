# Java笔记

1.构造函数

```java
import java.util.Arrays;
import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        clothe clothe1=new clothe(125,"red");  //构造函数复习
        System.out.println(clothe1.price);

        int a[] ={1,2,3,4,5};
        System.out.println(Arrays.toString(a));//以数组形式输出

        String x="1.5";
        float f=Float.parseFloat(x);              //将字符串转化为数字
        System.out.println("the number is "+f);


        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=sc.nextInt();
        System.out.println("your age is:"+age);

        System.out.println("please enter your name");
        String name=sc.next().trim();
        System.out.println("your name is "+name);

    }

}

class clothe{
    float price;
    String color;

    clothe(float price,String color){  //带参数，构造函数
        this.color=color;
        this.price=price;
    }

    clothe (){   //无参构造方法

    }



}
//当final修饰方法时，这个方法会成为最终方法，无法被子类重写。”
```