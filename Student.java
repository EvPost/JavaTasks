import java.rmi.StubNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student{
    private String surname;
    private String name;
    private String patronymic;
    private Date biryhday;
    private String address;
    private long phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public void setBiryhday(Date biryhday){
        this.biryhday = biryhday;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(Long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public void setGroup(int group){
        this.group = group;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public Date getBiryhday(){
        return biryhday;
    }

    public String getAddress(){
        return address;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public String getFaculty(){
        return faculty;
    }

    public int getCourse(){
        return course;
    }

    public int getGroup(){
        return group;
    }

    public Student(String surname, String name, String patronymic, Date biryhday, String address, long phoneNumber, String faculty, int course, int group){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.biryhday = biryhday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[3];
        Date birth = new Date(2003, Calendar.MAY, 22);

        students[0] = new Student("Postulga", "Evgen", "Vasiliyovich", birth, "Lomonosova", 666666666, "mechmat", 3, 1);
        Date br = new Date(2002, Calendar.MARCH, 17);
        students[1] = new Student("Ivanov", "Ivan", "Ivanovich", br, "Shuseva", 667777777, "fizfac", 4,3);
        Date br3 = new Date(2005, Calendar.FEBRUARY, 3);
        students[2] = new Student("Tushkevich", "Anton", "Georgiyovich", br3, "Koneva", 668888888, "mechmat", 1, 2);
        
        System.out.println("Wich faculty do you seach?");
        String faculty = scan.nextLine();
        String[] faculties = new String[2];

        for (Student stud: students){
            if(faculty.toLowerCase().equals(stud.getFaculty().toLowerCase())){
                System.out.println(stud.getName()+ stud.getSurname()+ "studies at the faculty of "+ stud.getFaculty());
            }
        }

        for(int course = 1; course<=6; course++){
            System.out.println(course+"year students:\n");
            for (Student stud: students){
                if(stud.getCourse() == course){
                    System.out.println(stud.getName()+ stud.getSurname());
                }

            }
        }
    }



}