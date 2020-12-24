package frontend;
import entyti.CPU;
public class run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu = new CPU(10);
		CPU.Processor processor = cpu.new Processor(1, null);
		System.out.println(processor.getCache());
		
		CPU.Ram ram = cpu.new Ram("da","sda");
		System.out.println(ram.getClockSpeed());
	}

}
