package cn.com.sinosoft.tbf.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * spring rest 仓库配置
 *
 * @author lizhiyong
 *
 */
public class TbfRepositoryRestConfig extends RepositoryRestConfigurerAdapter {

	/**
	 * 仓库rest配置
	 * 
	 * @param config
	 */
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		// 跨域配置
		config.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("*")
			.allowedHeaders("*")
			.allowCredentials(false)
			.maxAge(3600);
	}

	/**
	 * 仓库验证配置
	 * 
	 * @param validatingListener
	 */
	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		super.configureValidatingRepositoryEventListener(validatingListener);
	}

}
