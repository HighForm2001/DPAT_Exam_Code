package QuestionB;

public class hairdryer_240v implements FunctionAPI{
    @Override
    public void workSomething(int id) {
        System.out.println("Working out using with 240v Hairdryer id: " + id);
    }
}
