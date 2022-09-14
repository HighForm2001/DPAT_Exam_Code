package QuestionB;

public class toothbrush extends Electric_Item{
    private int id;
    public toothbrush(FunctionAPI functionAPI, int id){
        super(functionAPI,id);
        this.id = id;
    }
    public void work(){
        functionAPI.workSomething(id);
    }
}
