package cn.xxc.jvmtest;

public class JVMStackTest {

	private int stackLen = 0;
	public void stackLeak() {
		this.stackLen++;
		this.stackLeak();
	}
	public static void main(String[] args) throws Throwable{

		JVMStackTest oom = new JVMStackTest();
		try {
			
			oom.stackLeak();
		}catch(Throwable e){
			System.out.println(oom.stackLen);
			throw e;
		}
	}

}
