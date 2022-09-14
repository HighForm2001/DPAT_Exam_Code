package QuestionB;

public class BridgePattern {
    public static void main(String[] args){
        Electric_Item hairdryer_120 = new hairdryer(new hairdryer_120v(),1);
        Electric_Item hairdryer_240 = new hairdryer(new hairdryer_240v(),2);
        hairdryer_240.work();
        hairdryer_120.work();
    }
}
