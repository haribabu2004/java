// class author{
//     String name,title;
// }

// class book extends author{
//     int ISDN;
//     float price;
// }

// class pub extends book{
//     String ed;
//     pub(String ed,String name,String title,int ISDN,float price){
//         this.ed=ed;
//         this.title=title;
//         this.price=price;
//         this.ISDN=ISDN;
//         this.name=name;
//         System.out.println("Name: "+name+"\n"+"Title: "+title+"\n"+"ISDN: "+ISDN+"\n"+"Price: "+price+"\n"+"Ed: "+ed);
//     }


// }





public class DAY5 {
    public static void main(String[] args) {
        // pub obj = new pub("2004 edition","Gopal","Into the vadasitthur",4569,99.45f);
        // int[] arr=new int[6];
        // arr[0]=89;
        // arr[2]=43;
        // arr[3]=21;
        // arr[1]=7;
        // arr[4]=01;
       
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // class sum()){
        //     void sum(int n1,int n2){
        //     System.out.println(n1+n2);
        //     }
        // }

        int num1=10,num2=20;
        
        Integer num3=num1;
        Integer num4=num2;
        swap obj=new swap();
        obj.swaap(num3,num4);
        System.out.println(num3+" "+num4);        
        
}
}

class swap{
    void swaap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
    }
    
}
