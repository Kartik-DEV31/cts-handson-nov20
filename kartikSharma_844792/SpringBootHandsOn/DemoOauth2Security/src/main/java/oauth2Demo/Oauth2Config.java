package oauth2Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
public class Oauth2Config extends AuthorizationServerConfigurerAdapter {

	// this will authenticate the client & the user using some default
	// authentication manager
	@Autowired
	private AuthenticationManager authenticationManager;

	// this will give the user details
	@Autowired
	private UserDetailsService userDetailsService;

	@Value("${security.oauth2.client.client-id}")
	private String clientid;

	@Value("${security.oauth2.client.client-secret}")
	private String secretpassword;

	@Value("${security.oauth2.client.authorized-grant-types}")
	private String grantTypes;

	@Value("${security.oauth2.client.auto-approve-scopes}")
	private String scopes;

	// this registers the application details
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		// you can check the application details either in database or in-memory
		clients.inMemory().withClient(clientid).secret("{noop}" + secretpassword).authorizedGrantTypes(grantTypes)
				.scopes(scopes);

	}

	// this configures oauth2.0 to use default authentication manager & user details
	// service
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager).userDetailsService(userDetailsService);
	}

}
