public class pali {
    public static void main(String a[]){
        String s="race a car";
        s=s.toLowerCase();
        int left=0,count=0,right=s.length()-1;
        while(left<right){
            char leftchar=s.charAt(left);
            char rightchar=s.charAt(right);

            while(left<right && !Character.isLetterOrDigit(leftchar)){
                left++;
                leftchar=s.charAt(left);
            }

            while(left<right && !Character.isLetterOrDigit(rightchar)){
                right--;
                rightchar=s.charAt(right);
            }

            if(rightchar!=leftchar){
                count=1;
            }
            left++;
            right--;
        }  
        count=0;
        if(count==0){
            System.out.println("Not a palindrome");
        }
        else{
            System.out.println("A palindrome");
        }
    }
}
