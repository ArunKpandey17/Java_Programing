 class Emp{
    private String empioyeeName;
    private String department;
    private double basesalary;
    private int performanceScore;
     

    public double calculateBonus(int performanceScore){
        
if(performanceScore>=8 && performanceScore<=10){
return basesalary*0.20;
}
else if(performanceScore>=5 && performanceScore>=7){
    return basesalary*0.10;
}
else if(performanceScore<=5){
    return basesalary;
}
else System.out.println("not a employee");
return 0;
    }

    public  void setname(String x ){ this.empioyeeName=x; }
    public String getname(){ return empioyeeName; }
    public void setperformanceScore(int performanceScore){this.performanceScore=performanceScore;}
    public int getperformanceScore(){return performanceScore;}
    public void setdepartment(String department){this.department=department;}
    public String getdepartment(){return department;}
    public void setbasesalary(double basesalary){this.basesalary=basesalary;}
    public double getbasesalary(){return basesalary;}
    
}
public class Employee{
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setname("Arun");
        e1.setdepartment("IT");
        e1.setbasesalary(50000);
        e1.setperformanceScore(1);

        System.out.println("Name of the Emp:"+e1.getname());
        System.out.println("Department of the Emp:"+e1.getdepartment());
        System.out.println("Basesalary of the Emp :"+e1.getbasesalary());
        System.out.println("Perfomance of the Emp :"+e1.getperformanceScore());
        System.out.println("Bonus of the Emp:"+e1.calculateBonus(e1.getperformanceScore()));
        
    }
    
}
