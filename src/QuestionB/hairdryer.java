package QuestionB;

public class hairdryer extends Electric_Item{
    private int id;
    public hairdryer(FunctionAPI functionAPI, int id){
        super(functionAPI,id);
        this.id = id;
    }
    public void work(){
        functionAPI.workSomething(id);
    }
}
