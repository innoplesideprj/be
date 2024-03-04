package sideproject.meet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeetApplicationTests {

	@Test
	void contextLoads() {
		if(1 == 1) {
			throw new IllegalStateException();
		}
	}

}
