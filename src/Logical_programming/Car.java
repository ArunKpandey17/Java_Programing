   

package Logical_programming;

class Car{
    float speed;
    int time;
    public static void setSpeed(float speed,int time){
        float distance = speed * time;
 System.out.println("Distance covered By Car :" +distance);
}


   public static void main(String[] args){

    
    
       Car C1 = new Car();
       Car C2 = new Car();

      C1.speed = 85;
      C1.time = 22;


     C2.speed = 100;
     C2.time = 10;

      setSpeed(C1.speed,C1.time);
      setSpeed(C2.speed,C2.time);

       

    }
}