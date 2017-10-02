public class StudentApp {

    private Student st1, st2, st3, st4;

    public static void main(String[] args) {
        StudentApp frame = new StudentApp();
        frame.createStudent();
    }

    private void createStudent(){
        /*st1 = new Student();
        * st1.setNaam("Kwik");
        * st1.setStudentnummer(111);
        */
        st1 = new Student("Kwik",111);

        /*st2 = new Student();
        * st2.setNaam("Kwek");
        * st2.setStudentnummer(222);
        */
        st2 = new Student("Kwek",222);

        /*st3 = new Student();
        * st3.setNaam("Kwak");
        * st3.setStudentnummer(333);
        */
        st3 = new Student("Kwak", 333);

        /*st4 = new Student();
        * st4.setNaam("Donald");
        * st4.setStudentnummer(444);
        */
        st4 = new Student("Donald",444);
    }
}
