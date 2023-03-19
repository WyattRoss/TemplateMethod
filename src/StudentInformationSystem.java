public class StudentInformationSystem extends InformationSystem{
    @Override
    public boolean authenticate(){
        // some authentication code goes here
        System.out.println("Authentication Complete");
        return true; // if authentication is correct
    }

    @Override
    public void getContent(){
        System.out.println("This is the content for a student");
    }
}
