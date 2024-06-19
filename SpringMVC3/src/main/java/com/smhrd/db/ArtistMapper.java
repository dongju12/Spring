package com.smhrd.db;

import java.util.List;

// import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.ArtistVO;

// @Mapper --> Spring 버전이 업그레이드 되면서 생략 가능
public interface ArtistMapper {

	public List<ArtistVO> artist(ArtistVO avo);
	
}
