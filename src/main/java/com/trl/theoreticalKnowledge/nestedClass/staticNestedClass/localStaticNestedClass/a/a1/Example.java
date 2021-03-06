package com.trl.theoreticalKnowledge.nestedClass.staticNestedClass.localStaticNestedClass.a.a1;

public class Example {
}

class Outer {

    public Outer() {
//        static class LocalStaticNestedClass { }                                               // Compilation ERROR !!!
    }

    public void someMethod() {
//        static class LocalStaticNestedClass { }                                               // Compilation ERROR !!!
    }

    public static void someMethod_2() {
//        static class LocalStaticNestedClass { }                                               // Compilation ERROR !!!
    }

    public static void someMethod_3() {
        /*
         * This is a difficult situation that I could not solve. This method is static. Because of this, this method
         * belongs to the "class type" and not "object type". Because of this, we can assume that, "LocalInnerClass"
         * which is defined in this method is an "LocalStaticNestedClass".
         * */
        class LocalStaticNestedClass {
        }
    }

    {
//        static class LocalStaticNestedClass { }                                               // Compilation ERROR !!!
    }

    static {
//        static class LocalStaticNestedClass { }                                               // Compilation ERROR !!!
    }

    static {
        /*
         * This is a difficult situation that I could not solve. This area is static. Because of this, this method
         * belongs to the "class type" and not "object type". Because of this, we can assume that, "LocalInnerClass"
         * which is defined in this method is an "LocalStaticNestedClass".
         * */
        class LocalStaticNestedClass {
        }
    }
}
