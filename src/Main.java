public class Main{
    public static void main(String[] args){
        InformationSystem studentIS = new StudentInformationSystem();
        studentIS.createPage();
        System.out.println("\n\n");
        InformationSystem facultyIS = new FacultyInformationSystem();
        facultyIS.createPage();
    }
}
