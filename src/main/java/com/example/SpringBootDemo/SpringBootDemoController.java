@RestController
public class SpringBootDemoController {
	@RequestMapping("/")
	public String printHelloWorld() {
		return "Greeting From SpringBoot!";
	}
}