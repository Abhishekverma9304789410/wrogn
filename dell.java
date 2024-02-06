class employee{
        int id;
        int salary;
        String name;
        public void printDetails(){
                System.out.println("my id is id"+ id);
                System.out.println("and my name is" + name);
        }
        public int getSalary(){
                return salary;
        }
}
 public class dell{
        public static void main(String[] args){
                System.out.println("this is custom class");
                Employee harry = new Employee();
                Employee john = new Employee();
                harry.id =12;
                harry.salary= 5l66;
                harry.name = "Abhishek";
                john.id =327;
                john.salary=47;
                john.name = "alok";
                harry.printDetails();
                john.printDetails();
                int salary =john.getSalary();
                System.out.println(salary);
        }
 }