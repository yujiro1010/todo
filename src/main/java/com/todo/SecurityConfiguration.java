package com.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.todo.service.DatabaseUserDetailsService;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    DatabaseUserDetailsService databaseUserDetailsService;

    @Autowired
    PasswordEncoder PasswordEncoder;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO 自動生成されたメソッド・スタブ
        auth.userDetailsService(databaseUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO 自動生成されたメソッド・スタブ
        http.authorizeRequests().antMatchers("/css/**").permitAll()
        .anyRequest().authenticated()
        .and().formLogin().loginPage("/login").usernameParameter("user_name").passwordParameter("password").permitAll()
        .and()
        .logout().logoutUrl("/logout")
        .invalidateHttpSession(true)
        .deleteCookies("JSESSIONID");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
