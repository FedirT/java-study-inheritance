/**
 * Created by 1 on 25.08.2017.
 */
/*
* variables a and b are using for watch over them change in callings
* chain of inheritance: AA - BB - CC - DD
* overloading of methods which are using in constructors:
*           AA()
*               aaMethod()
*           BB()
*               aaMethod()
*           CC()
*               aaMethod()
*           DD()
*               ccMethod()
* methods use() and useB() was created for check created instances
* (their fields and methods) outside the classes
*/
class AA {

    AA() {
        aaMethod();
    }
    int a = 1;
    void aaMethod() {
        //a++;
        char b = 'a';
        System.out.println("hello aaMethod " + a + b);
    }

    public static void use(){
        AA aaOb = new AA();
        System.out.println();
        aaOb.aaMethod();
    }

}
class BB extends AA{
    BB() {
        aaMethod();
        //AA aaObj = new BB();
    }
    int a = 2;
    void aaMethod() {
        //a++;
        char b = 'b';
        System.out.println("hello bbMethod "  + a + b);

    }
    public static void useB(){
        BB bbOb = new BB();
        System.out.println();
        bbOb.aaMethod();
    }
}
class CC extends BB{
    CC() {
        char b = 'c';
        aaMethod();
    }
    int a = 3;
    void aaMethod() {
        //a++;
        char b = 'c';
        a = 5;
        System.out.println("hello ccMethod "  + a + b);
        //AA aaObj = new BB();
    }
    public static void useC(){
        CC bbOb = new CC();
        System.out.println();
        bbOb.aaMethod();
    }
}
class DD extends CC{
    DD() {
        ccMethod();

    }
    void ccMethod() {
        char b = 'd';
        System.out.println("hello ddMethod "  + a + b);
    }
}
public class DemoCallingConstructors {
    public static void main(String args[]){
        CC ccOb = new CC();
        //ccOb.aaMethod(); //call aaMethod, (from class AA),
        // isn't overloaded in CC!!!
        //System.out.println();
        //AA.use();
        //System.out.println();
        //BB.useB();
        /*System.out.println();
        DD ddOb = new DD();
        ddOb.aaMethod();
        */
    }

}
