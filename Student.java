class Student { 
   int sid; 
   String sname; 
   String email; 
   long phone;
   void Student() { 
   System.out.println("method-student()");
   }
   Student() {
        System.out.println("zero parameter const");
   }
   Student(int id, String sn, String em){
        System.out.println("3 parameter const");
        sid = id; 
        sname = sn; 
        email = em;
   }
   Student(int id, String sn, String em, long ph) {
        System.out.println("4 parameter const");
        sid = id; 
        sname = sn; 
        email = em; 
        phone = ph; 
   }
   String show() { 
   System.out.println(sid); 
   System.out.println(sname); 
   System.out.println(email); 
   System.out.println(phone); 
   return"bbc";
   }
  public static void main(String[] args){
    Student s1=new Student();	
    s1.show();   
 Student s2 = new Student(102, "kd,kiran@bbc.com",s1.show());
 Student s3 = new Student(103, "kiran,Kiran@bbc.com",s2.show(),8888809416L);
    s3.show();
    s1.Student();  //calling the normal method,not the constructor
  }
}
  
