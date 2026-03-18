package Logical_programming;
class ArunCompany {
    static double flattaxrate = 5.6f;
    double basicsalary, bonus;

    public static void main(String[] args) {
        ArunCompany Emp1 = new ArunCompany();
        ArunCompany Emp2 = new ArunCompany();

        Emp1.basicsalary = 4500;
        Emp1.bonus = 500;
        double Emp1finalsalary = Emp1.basicsalary + Emp1.bonus - (flattaxrate * (Emp1.basicsalary + Emp1.bonus)) / 100;
        System.out.println("Emp1 final salary:" + Emp1finalsalary);
        Emp2.basicsalary = 8000;
        Emp2.bonus = 7000;
        double Emp2finalsalary = Emp2.basicsalary + Emp2.bonus - (flattaxrate * (Emp2.basicsalary + Emp2.bonus)) / 100;
        System.out.println("Emp2finalsalary:" + Emp1finalsalary);

        if (Emp1finalsalary > 6000) {
            System.out.println("Emp1 is Eligible for standerd benefits");
        } else
            System.out.println("Emp1 is  Not Eligible for standerd benefits");

        if (Emp2finalsalary > 6000) {
            System.out.println("Emp2 is Eligible for standerd benefits");
        } else
            System.out.println("Emp2 is  Not Eligible for standerd benefits");

    }

}