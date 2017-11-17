package cn.com.sinosoft.demo.domain.db;

import org.springframework.data.rest.core.config.Projection;

/**
 * Projection 自定义返回信息
 *
 * @author lizhiyong
 *
 */
@Projection(name = "petPubInfo", types = { Pet.class })
public interface PetPubInfo {
	
	public String getNo();
	public String getNameEn();
	public String getNameZhcn();

}
