package com.example.demo.cms.information;

import com.example.demo.web.PagesRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class InformationService {

	private Logger logger = LoggerFactory.getLogger(InformationService.class);

	@Autowired
	private InformationDao informationDao;
//	@Value("${information.type.news}")
//	private String news;

//	@Autowired
//	FeignInformationApi feignInformationApi;
	
	/**
	 * 理财资讯列表信息查询
	 * 
	 * @return
	 */
	public PagesRep<InformationEntity> informationQuery(int page, int rows) {
		List<InformationEntity> products = this.informationDao.getHomeInformation();
		PagesRep<InformationEntity> pagesRep = new PagesRep<InformationEntity>();
		pagesRep.setRows(products);
		pagesRep.setTotal(products.size());
		return pagesRep;
	}

}
