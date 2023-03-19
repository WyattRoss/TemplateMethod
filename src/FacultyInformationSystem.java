public class FacultyInformationSystem extends InformationSystem{
    @Override
    public boolean authenticate(){
        // some authentication code goes here
        System.out.println("Basic Authentication Complete");
        System.out.println("Check your device for a 2-factor authentication code");
        // 2fa code goes here
        return true;
    }

    @Override
    public void getContent(){
        System.out.println("This is the content for faculty");
    }
}
