package ntv.test.bundle;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true)
public class HelloWorld {

	@Activate
	public void act() {
		System.out.println("Hello World");
	}
}
