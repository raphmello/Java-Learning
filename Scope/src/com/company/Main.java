package com.company;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.useInner();

        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        ScopeCheck.InnerClass innerClass1 = scopeInstance.new InnerClass();
        System.out.println(innerClass1.varThree);
    }
}
