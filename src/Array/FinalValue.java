package Array;

public class FinalValue {
    public int finalValueAfterOperations(String[] operations) {
        System.out.println(operations);
        int X=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                X++;
            }else if(operations[i].equals("--X") || operations[i].equals("X--")){
                X--;
            }
        }
        return X;
    }
}
