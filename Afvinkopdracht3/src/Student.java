public class Student {

    private String naam;
    private int studentnummer;

    public Student(String stNaam, int stNummer){
        naam = stNaam;
        studentnummer = stNummer;
    }

    public Student(String stNaam){
        naam = stNaam;
        studentnummer = 0;
    }

    public Student(int stNummer){
        naam = "";
        studentnummer = stNummer;
    }

    public void setNaam(String s){
        naam = s;
    }

    public String getNaam(){
        return naam;
    }

    public void setStudentnummer(int i){
        studentnummer = i;
    }

    public int getStudentnummer(){
        return studentnummer;
    }

}
