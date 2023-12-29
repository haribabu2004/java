public class strbuff {
public static void main(String arg[]){
    StringBuilder str=new StringBuilder("Sri Eshwar College");
    System.out.println(str);
    str.insert(1, "i");
    System.out.println(str);
    str.replace(0, 2, "COME");
    System.out.println(str);
    str.reverse();
    System.out.println(str);
    str.delete(0, 3);
    System.out.println(str);
    System.out.println(str.charAt(1));
    System.out.println(str.indexOf("raw"));
    System.out.println(str.length());
    System.out.println("SIva".toUpperCase());
    System.out.println("POTTU SIVA".toLowerCase());
}
}

