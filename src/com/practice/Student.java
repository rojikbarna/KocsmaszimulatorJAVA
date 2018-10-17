package com.practice;

public class Student extends Human {

    private int scholarship;

    public Student(String name, int age, boolean gender, int money, int scholarship) {
        super(name, age, gender, money);
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public void learning(){
        setMoney(getMoney()+ scholarship);
    }
    public void learning(int time){
        int lerningmoney = (int)(scholarship*time+getMoney());
        setMoney(lerningmoney);
    }

    @Override
    public String toString() {
        return super.toString()+ " scholarship : "+ scholarship;
    }
}
