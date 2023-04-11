package HashCodeEquals1606;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Maria","alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

//        String a = "Claudio Delfino Machado está estudando JAVA HASHCOD";
//        String b = "Claudio Delfino Machado está estudando JAVA HASHCOD";
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
    }
}
