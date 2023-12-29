public class anagram {
        public static void main(String ar[]) {
            String s="race e car";
            s=s.toLowerCase();
            StringBuilder s1=new StringBuilder();
            int i=0;
            while(i<s.length()){
                char a=s.charAt(i);
                if((a>=97 && a<=128 )|| (a>='0' && a<='9')){
                    s1=s1.append(Character.toString(a));
                }
                i++;
            }
            StringBuilder s2= new StringBuilder();
            s2=s1.reverse();
            if(s1.equals(s2)){
                System.out.println("True");
            }
        System.out.println("false");
        }
    }

