public class DebuggingVariables {
    public static void main(String[] args){

        System.out.println("Hello!");

        boolean condition = DebuggingInternals.RandomBoolean();

        if (condition){
            System.out.println("Congratulations!");
        }

        if(DebuggingInternals.CheckCondition()){
            System.out.println("Have a nice day!");
        }
    }

}
