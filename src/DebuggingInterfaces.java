public class DebuggingInterfaces{
    public static void main(String[] args) {
        Object o = DebuggingInternals.GetObject();
        DebuggingInternals.DoTheWork(o);
    }

    interface BaseInterface{
        void DoSomething();
        void DoSomethingElse();
    }
}


