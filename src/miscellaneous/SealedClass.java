package miscellaneous;

sealed class A permits B, C{

}
sealed class B extends A permits D{

}
non-sealed class C extends A{

}
final class D extends B{

}
public class SealedClass {
    public static void main(String[] args){

    }
}
