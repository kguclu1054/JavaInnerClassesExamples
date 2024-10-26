package outer_class;

public class StaticNesned {

	static class StaticClass{
		void message() {
			System.out.println("Static iç sınıftan mesaj");
		}
	}
	
	public static void main(String[] args) {
		
		StaticNesned.StaticClass nested = new StaticNesned.StaticClass();
		nested.message();

	}

}
