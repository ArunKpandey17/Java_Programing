class  task {
    public String concatenation(String a, String b){
        return a+b;
    }
    public String concatenation(int a, int b){
        return ""+(a+b);
    }
    public String concatenation(String a, int b){
        return a+b;
    }
}

public class Concate{
public static void main(String[] args){
 task t1 = new task();
 System.out.println(t1.concatenation(null, 0));
 System.out.println(t1.concatenation(1,5));
 System.out.println(t1.concatenation(null, 0));
}
}