import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private String phone;
    Scanner sc=new Scanner(System.in);

    //constructor
    public User() {
    }

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User : " +
                "Ten : '" + name + '\'' +
                ", Tuoi : " + age +
                ", SDT : '" + phone + '\'' ;
    }
    public void inputData(){
        System.out.println("Nhap ten : ");
        this.name= sc.nextLine();
        System.out.println("Nhap tuoi : ");
        this.age= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap SDT: ");
        this.phone=sc.nextLine();
    }
    public void outputData(){
        System.out.println("Ten : "+getName());
        System.out.println("Tuoi : "+getAge());
        System.out.println("SDT : "+getPhone());
    }
}
