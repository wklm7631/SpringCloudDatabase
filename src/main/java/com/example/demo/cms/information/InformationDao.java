package com.example.demo.cms.information;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


public interface InformationDao extends JpaRepository<InformationEntity, String>, JpaSpecificationExecutor<InformationEntity>{

	/**
	 * 获取推荐的资讯信息
	 * @return
	 */
	@Query("FROM InformationEntity WHERE STATUS='published' AND isHome=1 order by publishTime desc")
	public List<InformationEntity> getHomeInformation();
	

}
