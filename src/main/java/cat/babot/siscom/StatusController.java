package cat.babot.siscom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

  @GetMapping("/status")
  public String greeting() {
    return "SISCOM 0.0.1";
  }
}
