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
import com.springbook.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	
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
	public String insertBoard(BoardVO vo,BoardDAO boardDAO) {
		System.out.println("�� ��� ó��");
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}	
	
	//�� ����
	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) {
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}
	
	//�� ����
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo , BoardDAO boardDAO) {
		System.out.println("�� ���� ó��"); 
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	//�� �� ��ȸ
	@RequestMapping(value="/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO,Model model) {
		System.out.println("�� �� ��ȸ ó��");
		
		model.addAttribute("board" , boardDAO.getBoard(vo));
		return "getBoard.jsp";
	}
	//�� ��� �˻�
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO,Model model){
		System.out.println("�� ��� �˻� ó��");
		//Null Check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		model.addAttribute("boardList" , boardList);
		return "getBoardList.jsp";
	}
}
