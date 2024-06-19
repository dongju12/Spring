package com.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.db.ArtistMapper;
import com.smhrd.model.ArtistVO;

@RestController
public class ArtistRestController {
	
	// table 단위로 컨트롤러, vo, mapper, mapper.xml 다 새롭게 생성
	
	@Autowired
	private ArtistMapper mapper;
	
	
	@RequestMapping("/artist")
	public List<ArtistVO> artist(ArtistVO avo){
		List<ArtistVO> list = mapper.artist(avo);
		return list;
	}
	
	
	
}
