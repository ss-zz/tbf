package cn.com.sinosoft.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import cn.com.sinosoft.demo.domain.db.Pet;
import cn.com.sinosoft.demo.domain.db.PetPubInfo;

/**
 * 数据库操作
 * 
 * @author lizhiyong
 *
 * @param <T>
 * @param <ID>
 */
@RepositoryRestResource(collectionResourceRel = "pets", path = "pet", itemResourceRel = "pet", excerptProjection = PetPubInfo.class, exported = true)
public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {

	Page<Pet> findByNameEn(@Param("nameEn") String nameEn, Pageable pageable);

	Page<Pet> findByNameZhcn(@Param("zhcn") String zhcn, Pageable pageable);

	/**
	 * 屏蔽方法-删除所有
	 */
	@Override
	@RestResource(exported = false)
	void deleteAll();

}
