package oauth2Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class UserSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Value("${user.oauth2.username}")
	private String username;

	@Value("${user.oauth2.password}")
	private String password;

	@Value("${user.oauth2.user.role}")
	private String role;

	// provides user credentials & roles
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser(username).password("{noop}" + password).roles(role);
	}

	// This object is used to handle the authentication, but spring container should
	// maintain this object
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}

	// This object is used to store user details that can be authenticated by the
	// AuthenticationManager
	@Bean
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		// TODO Auto-generated method stub
		return super.userDetailsServiceBean();
	}

}
