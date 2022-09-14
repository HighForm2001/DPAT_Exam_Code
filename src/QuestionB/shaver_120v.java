package QuestionB;

public class shaver_120v implements FunctionAPI{

    @Override
    public void workSomething(int id) {
        System.out.println("Working out using with 120v Shaver id: " + id);
    }
}
