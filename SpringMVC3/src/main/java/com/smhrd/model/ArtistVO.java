package com.smhrd.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // getter, setter
@AllArgsConstructor // 모든 필드값을 받는 생성자
@NoArgsConstructor // 기본 생성자
public class ArtistVO {
	
	private long keywordCnt;
	private String keyword;
	private String artist;
	private String channel;
	// jackson-databind로 날짜를 변환할때, 지정한 형식으로 변환해라
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date collectDate;
	
}
