package cat.babot.siscom;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SiscomApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void statusCheck() throws Exception {
		this.mockMvc.perform(get("/status")).andDo(print()).andExpect(status().isOk())
			.andExpect(content().string("SISCOM 0.0.1"));
	}
}
