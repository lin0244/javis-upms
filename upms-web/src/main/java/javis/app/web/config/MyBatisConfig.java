package javis.app.web.config;

import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-02
 * @time 下午10:04
 */
@Configuration
@MapperScan("javis.app.web.dao")
public class MyBatisConfig {

    /**
     * SQL执行效率插件
     */
    @Bean
    @Profile({"test", "local"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
//
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean() {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(new DruidDataSource());
//        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource[] {new ClassPathResource("javis/app/web/dao/impl/*.xml")});
//        sqlSessionFactoryBean.setTypeAliasesPackage("javis.app.web.entity.po");
//        return sqlSessionFactoryBean;
//    }
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//        configurer.setBasePackage("javis.app.web.dao");
//        configurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
//        return configurer;
//    }
}
