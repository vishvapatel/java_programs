import  java.lang.Runtime;
class runtime_demo{
    runtime_demo(){
        System.out.println("THis is the runtime demo");
    }
}
public class Finallize_garbage_collection {
    public static void main(String args[]){
        runtime_demo run = new runtime_demo();
        Runtime.getRuntime().gc();
        System.out.println("Finalized");
    }
}
