public class Employee {
    String name;
    int salary;
    int workhours;
    int hireYear;

    Employee(String name, int salary, int workhours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary <= 1000){
            return 0;
        } else {
            return (this.salary * 0.03);
        }
    }

    public int bonus(){
        if (this.workhours > 40){
            int total = 0;
            for (int i = 1; i <= (this.workhours-40);i++){
                total += 30;
            }
            return total;

        } else {
            return 0;
        }
    }

    public double raiseSalary(){
        int workingyear = 2021 - this.hireYear;

        if (workingyear >= 19){
            return (salary*0.15);
        } else if (workingyear >= 9 && workingyear < 19) {
            return (salary*0.1);
        } else {
           return (salary*0.05);
        }
    }

    void toSTring(){
        System.out.println("Adi:" + this.name);
        System.out.println("Maasi:" + this.salary);
        System.out.println("Calısma Saati:" + this.workhours);
        System.out.println("İse baslama yili:" + this.hireYear);
        System.out.println("Verginiz:" + tax());
        System.out.println("Kazanılan bonus:" + bonus());
        System.out.println("Maas artısı:" + raiseSalary());
        System.out.println("Toplam maas:" + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
