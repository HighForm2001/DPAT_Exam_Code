package QuestionB;

public class hairdryer_120v implements FunctionAPI{
    @Override
    public void workSomething(int id) {
        System.out.println("Working out using with 120v Hairdryer id: " + id);
    }
}
