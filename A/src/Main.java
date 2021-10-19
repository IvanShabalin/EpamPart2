import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        A a1 = new B();
        B b1 = new B();

        X x1 = a1.m();
        X x2 = b1.m();

        Y y1 = b1.m();
     /*A a = new A();
     B b = new B();
     C c = new C();
     D d = new D();

     A a2 = new A();
     a2.m();

     A a1 = new B();
     a1.m();

     A refBase;
     refBase = new A();
     refBase = new B();
     refBase = new C();
     refBase = new D();

        List<A> list  = new ArrayList<A>();

        A[] mas = new A[4];

        list.add(new D());
        list.add(new B());
        list.add(new C());
        list.add(new A());

        mas[0] = new A();
        mas[0] = new B();
        mas[0] = new C();
        mas[0] = new D();*/
    }
}
