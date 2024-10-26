package outer_class;

public class Main{
	public static void main(String[] args) {
		Anonymous_Inner_Class outer = new Anonymous_Inner_Class(){
			
			@Override
			public void sound() {
				System.out.println("Anonim iç sınıftan örnek");
			}
		};
		outer.sound();
	}
}

