package com.example.demo.cms.information;

import com.example.demo.web.PagesRep;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/cms/boot/information", produces = "application/json")
public class InformationController {
	private static final Logger logger = LoggerFactory.getLogger(InformationController.class);
	@Autowired
	private InformationService informationService;
//	@Autowired
//	private InformationTypeService InformationTypeService;
//	@Autowired
//	private InformationNewService informationNewService;
//	@Autowired
//	private ImgUtils imgUtils;
	/**
	 * 理财资讯页面数据查询
	 * @param request
	 * @param spec
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value = "/informations", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<PagesRep<InformationEntity>> informationQuery(HttpServletRequest request,
		@RequestParam int page,@RequestParam int rows) {
		PagesRep<InformationEntity> rep = this.informationService.informationQuery(page, rows);
		return new ResponseEntity<PagesRep<InformationEntity>>(rep, HttpStatus.OK);
	}
	
}
