package pl.akademiakodu.kwejk.projekt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // sample users
    @Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("justyna").password("123").roles("USER")
                .and()
                .withUser("aurora").password("321").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers("/", "/app.*","/*.png", "/categories", "/gifs/**",
//                        "/icons/**","/vendor/**", "/category/**", "/h2/**").permitAll()
                .antMatchers("/addCategory").hasRole("ADMIN")
                .antMatchers( "/**").permitAll()
//                .antMatchers("/nic/**").hasRole("USER")
                .anyRequest().authenticated()
                .and().formLogin().defaultSuccessUrl("/")
                .and().logout().logoutSuccessUrl("/");
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}