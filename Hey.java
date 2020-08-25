/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hey;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
class student
{
    String name;
    int rollno;
    void get()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the name:\n");
        name=obj.next();
        System.out.println("enter the roollno\n");
        rollno=obj.nextInt();
    }
    void display()
    {
        
        System.out.println("name="+name);
        System.out.println("rollno="+rollno);
    }
}
class mark extends student
{
    int m1,m2,m3;
    void get1()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the mark1\n");
        m1=obj.nextInt();
        System.out.println("enter the mark2\n");
        m2=obj.nextInt();
        System.out.println("enter the mark3\n");
        m3=obj.nextInt();
    }
    void display1()
    {
        
        
        System.out.println("mark 1="+m1);
        System.out.println("mark 2="+m2);
        System.out.println("mark 3="+m3);
       
    }
}
class result extends student
{
    int avg;
    void average(int a,int b,int c)
    {
        avg=(a+b+c)/3;
        System.out.println("average="+avg);
        if(avg>=90&&avg<=100)
        {
            System.out.println("the student grade is= A");
        }
        else if(avg>=80&&avg<90)
        {
            
            System.out.println("the student grade is=B");
        }
        else if(avg>=70&&avg<80)
        {
            System.out.println("the student grade is=C");
        }
        else if(avg>=60&&avg<70)
        {
            System.out.println("the student grade is=D");
        }
        else if(avg>60)
        {
           System.out.println("the student grade is=E");
        }
        else
        {
            System.out.println("the student grade is =F");
        }
    }
}
public class Hey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        mark obj1=new mark();
        obj1.get();
        obj1.display();
        obj1.get1();
        obj1.display1();
        result obj3=new result();
        obj3.average(obj1.m1,obj1.m2,obj1.m3);
    }
    
}
