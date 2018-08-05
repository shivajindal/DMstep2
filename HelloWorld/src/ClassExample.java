

public class ClassExample {
        int x = 10;

        
        public class NestedClass
        {
            void display()
            {
                System.out.println("inner class");   
            }          
        }
        
     void disp()
        {  NestedClass x = new NestedClass();
       x.display();}
        
        public static void main(String[] args)
        {
          
            ClassExample n = new ClassExample();
            n.disp();
            
        }

}
