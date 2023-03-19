public abstract class InformationSystem{

    public abstract boolean authenticate();

    public abstract void getContent();
    
    public void createPage(){
        if(authenticate()){
            getContent();
        }
    }
}
