package entities;

public class employee {

   public String name;
   public double grossSalary;
   public double tax;


   public double NetSalary(){
       return grossSalary - tax;
   }

   public void IncreaseSalary(double percentage){

       grossSalary = grossSalary + (grossSalary * 0.1);

   }

   public String toString(){

      return name
           + ", $ "
           + String.format("%.2f\n",NetSalary());

   }

}
