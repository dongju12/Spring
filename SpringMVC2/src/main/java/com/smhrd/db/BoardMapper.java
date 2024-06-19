package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.smhrd.model.BoardVO;
import com.smhrd.model.SearchCriteria;

public interface BoardMapper {
	
	// 전체 게시글을 조회해서 결과값을 반환해주는 메소드
	public List<BoardVO> boardList();
	
	// 게시글 등록 메소드
	public void register(BoardVO vo);
	
	// 게시글 한 개를 조회하는 메소드
	@Select("select * from board where idx = #{idx}")
	public BoardVO boardContent(int idx);
	
	@Delete("delete from board where idx = #{idx}")
	public void boardDelete(int idx);

	public List<BoardVO> search(SearchCriteria criteria);

	public List<BoardVO> autocomplete(SearchCriteria criteria);
	
}
