
// arraylist 练习题目1
import java.util.ArrayList;

//新建一个学生类，包含四个部分
//创建一个集合，用来存储学生对象，用泛型，<Student>
//根据类，创建4个学生对象
//将4个学生对象添加到集合中：add
//遍历集合：for、size、get 函数
public class notes{
    public static void main(String[] args) {

        student one=new student(1,'f',1,"one");
        student two=new student(2,'m',2,"two");
        student three=new student(3,'f',3,"three");
        student four=new student(4,'m',4,"four");

        ArrayList<student> list=new ArrayList<>();

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {

            student stu=list.get(i);
            System.out.println(stu.sex);
            System.out.println(stu.name);
            System.out.println(stu.number);
            System.out.println(stu.score);

        }

    }
}

class student{
    int number;
    char sex;
    int score;
    String name;

    student(int number,char sex,int score,String name){
        this.name=name;
        this.sex=sex;
        this.score=score;
        this.number=number;
    }


}




//arraylist练习2：打印arraylist
//改变list的固定输出方式

import java.util.ArrayList;

public class notes{

    public static void printarray(ArrayList <String> list ){
        System.out.print("{");

        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);

            if(i== list.size()-1){
                System.out.print(name+"}");
            }
            else {
                System.out.print(name+"@");
            }
        }

    }


    public static void main(String[] args) {

        ArrayList <String> list=new ArrayList<>();

        list.add("一号");
        list.add("二号");
        list.add("三号");
        list.add("四号");

        System.out.println(list);

        printarray(list);




    }



}