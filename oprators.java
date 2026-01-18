class oprators{
     public static void main(String[] args){
         //types of oprators : 1 Arithmatoc oprators
         // in this oprations like add, sub, multi,divi,reminder are done
        //  int a=25;
        //  int b=20;
        //  System.out.println(a+b);// 45
        //  System.out.println(a-b);//5
        //  System.out.println(a*b); //
        //  System.out.println(a/b);
        //  System.out.println(a%b);
         // 2 assignment oprators
         //used to assign value using =,+=,-=,
         int a =10;
         a+=5;
         a-= 4;
         System.out.println(" value of a :" + a);// ans is 11
         
         
         // 3. relational operators(comparison opratos )
         //used to  compare values
         
        //  int x=10;
        //  int y=10;
        //  System.out.println(x>y);    
        //  System.out.println(x<y);
        //  System.out.println(x==y);
        //  System.out.println(x!=y);
        //  System.out.print(x>=y);
         
         
         
        //4 logical oprator (&&,``,!)
        
        int age=3;
        System.out.println(age>=18 && age<=20);
        System.out.println(age<18 || age> 20);
        System.out.println(age >=18);
        
         // 5 unary oprator
         //(++ , --)
         int d=50;
         d++;
        
         System.out.println(d);
         
         
         // 6 ternary oprator
         //condition? value_if_true:value_if_false
         
         int arry =10;
         String result =(age>=18 ? "adult": "minor");
         System.out.println(result);
         
         
     }
 }