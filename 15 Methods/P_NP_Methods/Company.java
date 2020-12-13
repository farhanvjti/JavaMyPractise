class Company{
    void getEmployee(Employee e){
        System.out.println("Eid="+e.eid);
        System.out.println("Ename="+e.ename);
        System.out.println("Dept="+e.dept);
        System.out.println("Salary="+e.esal);

    }

    void getAnnualSal(Employee e){
      System.out.println("CTC="+(e.esal*12));      
    }

    void appraisal(Employee e){
      e.esal=e.esal*120/100;
    }



}