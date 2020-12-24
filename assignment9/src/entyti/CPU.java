package entyti;

public class CPU {
	float price;
	Process process;
	Ram ram;
	public CPU(float price) {
		super();
		this.price = price;
	}
	public class Processor {
		int coreAmount;
		String menufacturer ;
		public Processor(int coreAmount, String menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}
		public float getCache() {
			return 4.3f;
		}
		
	}
	public class Ram {
		String memory;
		String menufacturer;
		public Ram(String memory, String menufacturer) {
			super();
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		public float getClockSpeed() {
			return 5.5f;
		}
	}
}
