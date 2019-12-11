package com.mydemo.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

//        ParameterBuilder token = new ParameterBuilder();
//        ParameterBuilder uuid = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<Parameter>();
//        token.name("token").description("手机唯一id")
//                .modelRef(new ModelRef("string")).parameterType("header")
//                .required(false).build(); //header中的ticket参数非必填，传空也可以
//        uuid.name("uuid").description("用户表示uuid")
//                .modelRef(new ModelRef("string")).parameterType("header")
//                .required(false).build(); //header中的ticket参数非必填，传空也可以
//        pars.add(token.build());    //根据每个方法名也知道当前方法在设置什么参数
//        pars.add(uuid.build());    //根据每个方法名也知道当前方法在设置什么参数


        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                .globalOperationParameters(pars)
                // 是否开启
                .enable(true).select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("com.mydemo.demo.controller"))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot-Swagger2集成和使用-demo示例")
                .description("测试")
                // 作者信息
                .contact(new Contact("wangwei", "https://blog.lqdev.cn/", "673580734@qq.com"))
                .version("1.0.0")
                .build();
    }

}
