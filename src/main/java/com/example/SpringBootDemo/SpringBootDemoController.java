@RestController
public class SpringBootDemoConroller {
	@RequestMapping("/")
	public String printHelloWorld() {
		return "Greeting From SpringBoot!";
	}
}