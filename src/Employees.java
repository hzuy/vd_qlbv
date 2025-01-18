public class Employees implements Manager{
    private String EmployeeID;

    public Employees(String employeeID) {
        EmployeeID = employeeID;
    }

    public Employees() {
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }


    @Override
    public void ManagerDoctors() {
        System.out.println("Nhan vien quan ly dang cap nhat thong tin bac si !");
    }

    @Override
    public void ManagerStaff() {
        System.out.println("Nhan vien quan ly dang cap nhat thong tin nhan vien  !");
    }
}
