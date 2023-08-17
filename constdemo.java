
class constdemo {
  private String name;
  constdemo() {
    System.out.println("Constructor Called:");
    name = "Programiz";
  }

  public static void main(String[] args) {

	  constdemo obj = new constdemo();
    System.out.println("The name is " + obj.name);
  }
}
  
  
	  