package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateFiled;

    public void publicMethod(){
        System.out.println("publicMethod 호출 "+ publicField);
    }

    void defaultMethod(){
        System.out.println("defaultMethd 호출 "+defaultField);
    }

    void privateMethod(){
        System.out.println("privateMethod 호출 "+privateFiled);
    }

    public void innerAceess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField=200;
        privateFiled =300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
