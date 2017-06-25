public class CamelStarter {

public static void main(String[] args) throws Exception {

	CamelContext context = new DefaultCamelContext();
	context.addRoutes(new IntegrationRoute());
	context.start();
	Thread.sleep(30000);

	context.stop();
	}
}