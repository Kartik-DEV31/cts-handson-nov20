package oauth2Demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authorizedController {

	@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> userInfo(OAuth2Authentication oauth2) {
		Map<String, Object> userinformation = new HashMap<>();
		userinformation.put("user", oauth2.getUserAuthentication().getPrincipal());
		return userinformation;
	}

}
