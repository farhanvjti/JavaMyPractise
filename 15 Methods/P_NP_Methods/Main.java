class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.eid = 101;
    e1.dept= "SDE";
    e1.ename="HK";
    e1.esal=50000;

    Company c1 = new Company();
    System.out.println("=====Employee Details=======");
    c1.getEmployee(e1);
    c1.getAnnualSal(e1);
    c1.appraisal(e1);
    System.out.println("=====Employee Details After Appraisal=====");
    c1.getEmployee(e1);
    c1.getAnnualSal(e1);
  }
}