package outer_class;

public class Member_Inner_Class {

	  class MemberInner {
		  void message() {
			  System.out.println("Üye iç sınıf örneği");
		  }
	  }
	
	public static void main(String[] args) {
		
		Member_Inner_Class outer = new Member_Inner_Class();
		MemberInner inner = outer.new MemberInner();
		inner.message();
		
	}
	
	

}
