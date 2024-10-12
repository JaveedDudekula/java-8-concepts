package lambda_expressions;

public class RunnableLambda {

	public static void main(String[] args) {

		// PRIOR JAVA 8

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};

		new Thread(runnable).start();

		// JAVA 8 LAMBDA

		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable 2");
		};

		new Thread(runnableLambda).start();
		
		new Thread( () -> System.out.println("Inside Runnable 3")).start();
	}

}
