package xxx;

import java.util.*;


public class Test {
    public static void main(String[] args){
        A a = new B();
        a.print();

        Collection<B> coll = new ArrayList<B>();
        Iterator<B> ii = coll.iterator();


        LinkedList<A> Arr = new LinkedList<>();



        for (int i = 0; i < 10; i++) {
            Arr.add(new A());
        }
        Iterator<A> iter = Arr.iterator();
        while (iter.hasNext()){
            iter.next().print();
        }

        for (A ai: Arr) {
            ai.print();
        }

    }

    public class C {}

    public static class A{
        public void print(){
            System.out.println("A");
        }
    }
    public static class B extends A{
        public void print(){
            System.out.println("B");
        }

    }

}
