package com.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smhrd.db.BoardMapper;
import com.smhrd.model.BoardVO;
import com.smhrd.model.SearchCriteria;

@Controller // 기능이 정의되어있음
public class BoardController {
	
	@Autowired // 별표 백만개 ~ *******	
	private BoardMapper mapper;
	
	
	
	// 글 삭제하는 기능
	@RequestMapping("/boardDelete/{idx}")
	public String boardDelete(@PathVariable("idx") int idx) {
		mapper.boardDelete(idx);
		return "redirect:/";
		}
	
	// 글 상세조회 기능
	@GetMapping("/boardContent/{idx}")
    public String boardContent(@PathVariable("idx") int idx, Model model) {
       BoardVO result = mapper.boardContent(idx);
       model.addAttribute("board", result);
       return "content";
    }
	
	
	// 글쓰기 기능을 하는 메소드 생성
	@PostMapping("/register") // --> post전송방식일때만 메소드 실행
	public String register(BoardVO vo) {
		mapper.register(vo);
		return "redirect:/";
	}
	
	// 글쓰기 페이지로 이동하는 메소드 생성
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/") // "/" 요청이 들어왔을 때 board 메소드를 실행
	public String board(Model model) {
		List<BoardVO> list = mapper.boardList();
		model.addAttribute("list", list);
		return "board";
	}
	
	
}
