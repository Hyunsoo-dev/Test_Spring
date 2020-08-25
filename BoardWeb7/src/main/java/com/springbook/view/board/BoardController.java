package com.springbook.view.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//�˻� ���� ��� ���� 
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����" , "TITLE");
		conditionMap.put("����" , "CONTENT");
		return conditionMap; //model ��ü�� �����.
	}
	
	
	//�� ���
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) {
		System.out.println("�� ��� ó��");
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}	
	
	//�� ����
	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}
	
	//�� ����
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("�� ���� ó��"); 
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	//�� �� ��ȸ
	@RequestMapping(value="/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("�� �� ��ȸ ó��");
		
		model.addAttribute("board" , boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	//�� ��� �˻�
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model){
		System.out.println("�� ��� �˻� ó��");
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		model.addAttribute("boardList" , boardList);
		return "getBoardList.jsp";
	}
}
