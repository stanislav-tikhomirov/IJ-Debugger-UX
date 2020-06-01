import java.lang.reflect.InvocationTargetException;

public class DebuggingInternals {
    static void ThrowOrNot(int r) throws Exception {
        if (ShouldThrow(r)){
            throw new Exception();
        }
    }

    public static boolean ShouldThrow(int r){
        return r<2;
    }

    static boolean CheckCondition() {
        return false;
    }

    public static boolean RandomBoolean() {
        return false;
    }

    public static Object GetObject() {
        return new Implementations.DerivedNumberN();
    }

    public static void UseReflection(Object obj){
        try {
            obj.getClass().getMethod("DoSomething").invoke(obj);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void DoTheWork(Object obj){
        UseReflection(obj);
        Implementations.DerivedNumber1 d1 = new Implementations.DerivedNumber1();
        d1.DoSomethingElse();
        Implementations.DerivedNumber2 d2 = new Implementations.DerivedNumber2();
        d2.DoSomethingElse();
        Implementations.DerivedNumber3 d3 = new Implementations.DerivedNumber3();
        d3.DoSomethingElse();
    }
}


