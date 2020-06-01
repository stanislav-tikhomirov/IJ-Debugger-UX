public class Implementations {
    static class DerivedNumber1 implements DebuggingInterfaces.BaseInterface{

        @Override
        public void DoSomething() {
        }

        @Override
        public void DoSomethingElse() {

        }
    }

    static class DerivedNumber2 implements DebuggingInterfaces.BaseInterface{

        @Override
        public void DoSomething() {
        }

        @Override
        public void DoSomethingElse() {
        }
    }

    static class DerivedNumberN implements DebuggingInterfaces.BaseInterface{

        @Override
        public void DoSomething() {
            System.out.println("DoSomething method is actually called.");
        }

        @Override
        public void DoSomethingElse() {

        }
    }

    static class DerivedNumber3 implements DebuggingInterfaces.BaseInterface{

        @Override
        public void DoSomething() {

        }

        @Override
        public void DoSomethingElse() {

        }
    }
}
