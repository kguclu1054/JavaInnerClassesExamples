package outer_class;

public class Local_Inner_Class {

	void outerMethod() {
		class LocalInner{
			void message() {
				System.out.println("Yerel iç sınıf örneği");
			}
		}
		
		LocalInner inner = new LocalInner();
		inner.message();
	}
	
public static void main(String[] args) {
		
		Local_Inner_Class outer = new Local_Inner_Class();
		outer.outerMethod();

	}
	
}
