package com.java.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Jai",50000));
        list.add(new Employee("Mahesh",80000));
        list.add(new Employee("Vishal",60000));
        list.add(new Employee("Hemant",64000));
        Collections.sort(list,new SalaryComp());
        System.out.println("Sorted list entries: ");
        for(Employee e:list){
            System.out.println(e);
        }
	}

}

class Employee{    
    private String name;
    private int salary;
 
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+", Salary: "+this.salary;
    }
}
 
class SalaryComp implements Comparator<Employee>{	 
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() < e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
