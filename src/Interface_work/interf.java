
package Interface_work;


@FunctionalInterface
interface Numbercheck{
    public  abstract void isPositive(int num);
}





public class interf {
    public static void main(String[] args) {
        Numbercheck n1=(num)->{
            if(num>0){
                System.out.println( num+ " is Positive");
            }
            else {System.out.println(num+ " is not Positive");}
        };
        n1.isPositive(125);

    }
}
