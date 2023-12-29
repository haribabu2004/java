public class new1 {
    public static void main(String args[]) {
        System.out.println("hari");
        String s="([{}])";
        int len=s.length();
        
        if((len % 2) != 0){
            System.out.println("false");
        }

        for(int i=0;i<len;i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
