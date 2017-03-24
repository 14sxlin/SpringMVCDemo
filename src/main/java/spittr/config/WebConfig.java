
package spittr.config;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.servlet.ViewResolver;
        import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
        import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc           //  启动 spring mvc
@ComponentScan("spittr.web")
public class WebConfig
        extends WebMvcConfigurerAdapter{//继承是为了覆盖后面的configure方法

    @Bean
    public ViewResolver viewResolver(){//配置JSP视图解析器
        InternalResourceViewResolver resolver=
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");//加上特定的前缀和后缀
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();    //配置静态资源的处理
        // 将对静态资源的请求转发到容器中默认的Servlet中去
        // 而不是使用DispatcherServlet来处理
    }
}