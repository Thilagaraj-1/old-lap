/*
1. Single
2. Multi Level
3. Hierarchical
4. Multiple
5. Hybrid

class sub_class_name extends super_class_name{

}
*/

class Parent{
    public void parentMethod(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    public void childMethod(){
        System.out.println("Child Method");
    }
}

class Inher{
    public static void main(String[] arg){
        Child c = new Child();
        c.parentMethod();
        c.childMethod();
    }
}