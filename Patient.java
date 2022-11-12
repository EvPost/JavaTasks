import java.util.Scanner;

public class Patient {
    private long IDnumber;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private long medicalCardNumber;
    private String diagnosis;

    public void setIDnumber(Long IDnumber){
        this.IDnumber = IDnumber;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(Long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setMedicalCardNumber(Long medicalCardNumber){
        this.medicalCardNumber = medicalCardNumber;
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

    public long getIDnumber(){
        return IDnumber;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }
    public String getPatronymic(){
        return patronymic;
    }

    public String getAddress(){
        return address;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public long  getMedicalCardNumber(){
        return  medicalCardNumber;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    public Patient(long IDnumber, String surname, String name, String patronymic, String address, long phoneNumber, long medicalCardNumber, String diagnosis){
        this.IDnumber = IDnumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Patient[] patients = new Patient[3];
        patients[0] = new Patient(324567799,"Postulga", "Evgen", "Vasiliyovich", "Lomonosova", 666666666, 313445280, "Covid19");
        patients[1] = new Patient(1342398763,"Ivanov", "Ivan", "Ivanovich", "Shuseva", 667777777, 32440413, "diarrhea");
        patients[2] = new Patient(312456374,"Tushkevich", "Anton", "Georgiyovich", "Koneva", 668888888, 145167689, "Covid19");
        
        System.out.println("Wich diagnosis do you seach?");
        String diagnos = scan.nextLine();

        for (Patient pat: patients){
            if(diagnos.toLowerCase().equals(pat.getDiagnosis().toLowerCase())){
                System.out.println(pat.getName()+ pat.getSurname()+ " have  "+ pat.getDiagnosis());
            }
        }

        System.out.println("a=");
        long a = scan.nextLong();
        System.out.println("b=");
        long b = scan.nextLong();

        System.out.println("This patients have Medical Card Number in interval ( "+a+", "+b+")\n");
        for (Patient pat: patients){
            if(a<pat.getMedicalCardNumber()&&b>pat.getMedicalCardNumber()){
                System.out.println(pat.getName()+ pat.getSurname()+ ". Medical Card Number:"+pat.getMedicalCardNumber());
            }
        }

    }

    
}
