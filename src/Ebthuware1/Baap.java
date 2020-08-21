package Ebthuware1;

class Baap {
    public int h = 4;
    public int getH(){
        System.out.println("Baap "+h); return h;
    }
}


class Beta extends Baap{
    public int h = 44;
    public int getH(){
        System.out.println("Beta "+h);
        return h;
    }
    public static void main(String[] args) {
//        Baap b = new Beta();
//        System.out.println(b.h+" "+b.getH());
//        Beta bb = (Beta) b;
//        System.out.println(bb.h+" "+bb.getH());
//        int int1 = 10, int2 = 20;
//        System.out.println(int1 % int2);
//        System.out.println("--------wrappers_______");
//
//        Long var1 = Long.valueOf(123);
//        Long var2 = Long.valueOf("123");
//        System.out.println(var1 == var2);
//        System.out.println(var1);
//        System.out.println(var2);

//        Long var3 = Long.valueOf(223);
//        Long var4 = Long.valueOf(223);
//        System.out.println(var3 == var4);
//
//        System.out.println(var3);
//        System.out.println(var4);

        Boolean buy = new Boolean(true);
        Boolean sell = new Boolean(true);
        System.out.print(buy == sell);
        boolean buyPrim = buy.booleanValue();
        System.out.print(!buyPrim);
        System.out.print(buy && sell);


    }
//    public void forwardReference() {
//        int a = b;
//        int b = 20;
//    }
}
/*
 Always remember: Instance methods are overridden and variables (and static methods) are hidden. Which instance method is invoked depends on the class of the actual object, while which field (and static method) is accessed depends on the class of the variable.
        Here, b refers to an object of class Beta so b.getH() will always call the overridden (subclass's method). However, the type of reference of b is Baap. so b.h will always refer to Baap's h. Further, inside Beta's getH(), Beta's h will be accessed instead of Baap's h because you are accessing this.h ('this' is implicit) and the type of this is Beta.

        The class of bb, on the other hand, is Beta. Thus, bb.h will always refer to Beta's h.*/