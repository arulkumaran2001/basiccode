import java.util.Arrays;

class employee implements Comparable<employee>{ //base class,super class,parrent class
    private String name;
    private double salary;
    employee(String n, double s){
        name=n;
        salary=s;
    }
    /*employee(){//if line number 35 super meth is not called this method will called
        name="";
        salary=0.0;
    }*/
    String getName(){return name;}
    public void setName(String n) {this.name = n;}
    double getSalary(){return salary;}
    public void setSalary(double s) {this.salary = s;}

    void salaryincrease(double percent){
        salary+= salary*percent/100;
    }

    @Override
    public int compareTo(employee o) {//obj1.compareto(obj2)
        if(salary==o.salary)//name.equals(o.name)
            return 0;
        if(salary<o.salary)
            return -1;
        return 1;
    }
}
class manager extends employee{ //derived class,sub class,child class
    double bonus;
    manager(String n,double s,double b){
        super(n,s);//name=n;salary=s;
        bonus=b;
    }
    void setbonus(double b){
        bonus=b;
    }

    @Override
    double getSalary() { // overriding performing aditional functions

        return super.getSalary()+bonus;
    }
}
public class inheritance {
    public static void main(String[] args){
        employee e1= new employee("arul",100000);
        e1.salaryincrease(10);

        System.out.println(e1.getSalary());
        manager m1=new manager("mady",200000,5000);
        employee e2=new manager("mani",50000,6000);//polimorphisn having to behivour
        //e1.bonus e1 is in base class bonus is in deriver class it cannot be accessed
        //m1.salary=90;// we can able to asign value directly but it is not the proper manner so...
        m1.setbonus(10000);
        System.out.println(m1.getSalary());
        int arr[]= new int[1];
        employee emp[]= new employee[4];
        emp[0]=new employee("hari",70000);
        emp[1]=new employee("bala",70000);
        emp[2]=new employee("babu",50000);
        emp[3]=m1;

        emp[3].setSalary(40000);
        //emp[3].setbomus()- this is not allowded
        manager m2=(manager) emp[3];

        //manager m3=(manager) emp[2];// emp[2] stores employee class object so it cannot be casted-it will give the run time error
        if(emp[2] instanceof manager){// to check it is a manager or employee object class
            manager m3=(manager) emp[2];
        }
        // for each loop
        for(employee i:emp){// dynamic binding
            System.out.println(i.getName()+" "+i.getSalary());
        }
        Arrays.sort(emp);
        for(employee i:emp){// dynamic binding
            System.out.println(i.getName()+" "+i.getSalary());
        }
    }
  }
