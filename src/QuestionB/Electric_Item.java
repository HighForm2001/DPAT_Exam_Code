package QuestionB;

public abstract class Electric_Item {
    private int id;
    protected FunctionAPI functionAPI;
    protected Electric_Item(FunctionAPI functionAPI, int id){
        this.functionAPI = functionAPI;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void work();
}
