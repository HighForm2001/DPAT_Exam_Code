package QuestionB;

public class shaver extends Electric_Item{
    private int id;
    public shaver(FunctionAPI functionAPI, int id){
        super(functionAPI,id);
        this.id=  id;
    }
    public void work(){
        functionAPI.workSomething(id);
    }
}
