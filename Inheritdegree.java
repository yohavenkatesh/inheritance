/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritdegree;

/**
 *
 * @author ADMIN
 */
class degree
{
    public void getdegree()
    {
        System.out.println("I GOT A DEGREE.");
    }
}
class undergraduate extends degree
{
    void undergraduate()
    {
        System.out.println("I AM AN UNDERGRADUATE.");
    }
}
class postgraduate extends degree
{
    void postgraduate()
    {
        System.out.println("I AM A POSTGRADUATE.");
    }
}
public class Inheritdegree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("calling  getdegree function using class degree object.....");
        degree o=new degree();
        o.getdegree();
        postgraduate obj=new postgraduate();
        undergraduate obj1=new undergraduate();
        System.out.println("..........");
        System.out.println("calling getdegree function using sub class postgraduate object....");
        obj.getdegree();
        System.out.println("..........");
        obj.postgraduate();
        obj1.undergraduate();
    }
    
}
