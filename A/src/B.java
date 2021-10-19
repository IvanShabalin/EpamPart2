public class B extends A {

//     public void m() {
//        System.out.println("B::m");
//    }
    public Y m() {
        super.m();
        System.out.println("B::m");
        return new Y();
    }
}
