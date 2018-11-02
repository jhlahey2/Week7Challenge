package com.lahey.week7challenge.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    BCryptPasswordEncoder myBCryptEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/","/h2/**").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/listalldepartmentsemployees").hasAuthority("USER")
                .antMatchers("/listallemployeesdepartment").hasAuthority("USER")
                .antMatchers("/home").hasAuthority("USER")
//                .antMatchers("/admin").hasAuthority("ADMIN")
//                .antMatchers("/eitherusersoradmin").hasAnyAuthority("USER,ADMIN")
                //FORGOT THE LAST TWO LINES!!
                .anyRequest().authenticated()
                .and().formLogin();

        http.headers().frameOptions().disable().and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //COMMA SEPARATE AUTHORITIES (SEPARATE STRINGS)
        auth.inMemoryAuthentication().withUser("user").password(myBCryptEncoder().encode("password"))
                .authorities("USER").and().passwordEncoder(myBCryptEncoder());
//        auth.inMemoryAuthentication().withUser("anadmin").password(myBCryptEncoder().encode("adminpassword")).authorities("ADMIN")
//                .and().passwordEncoder(myBCryptEncoder());
    }
}
