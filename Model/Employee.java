package com.sau.Project3.Model;


public class Employee {
    public int no;
    public String EName;
    public String Job;
    public Integer Mgr;
    public String HireDate;
    public int Sal;
    public Integer Comm;
    public int DeptNo;

    public Employee() {
    }

    public Employee(int no, String EName, String job, Integer mgr, String hireDate, int sal, Integer comm, int deptNo) {
        this.no = no;
        this.EName = EName;
        Job = job;
        Mgr = mgr;
        HireDate = hireDate;
        Sal = sal;
        Comm = comm;
        DeptNo = deptNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public Integer getMgr() {
        return Mgr;
    }

    public void setMgr(Integer mgr) {
        Mgr = mgr;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String hireDate) {
        HireDate = hireDate;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int sal) {
        Sal = sal;
    }

    public Integer getComm() {
        return Comm;
    }

    public void setComm(Integer comm) {
        Comm = comm;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int deptNo) {
        DeptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", EName='" + EName + '\'' +
                ", Job='" + Job + '\'' +
                ", Mgr=" + Mgr +
                ", HıreDate=" + HireDate +
                ", Sal=" + Sal +
                ", Comm=" + Comm +
                ", DeptNo=" + DeptNo +
                '}';
    }
}
