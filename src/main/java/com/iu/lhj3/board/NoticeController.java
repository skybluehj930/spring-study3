package com.iu.lhj3.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {
	
		@Autowired
		private NoticeService noticeService;
	
		@ModelAttribute(value = "board")
		public String getBoard() {
			//key board
			//value notice
			return "notice";
		}
		
		
//		public ModelAndView getSelect()throws Exception {
//			
//			return
//		}
		
		@GetMapping(value = "noticeList")
		public ModelAndView getSelectList(ModelAndView modelAndView) throws Exception {
			System.out.println("noticeList");
			List<BoardVO> noticeList = noticeService.getSelectList();
			for (BoardVO boardVO : noticeList) {
				System.out.println(boardVO.getTitle());
			}
			modelAndView.setViewName("board/boardList");
			modelAndView.addObject("list", noticeList);
			return modelAndView;
		}

//		@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
		@GetMapping(value = "noticeWrite")
		public String setInsert() throws Exception {
			return "board/boardWrite";
		}
		
//		@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
		@PostMapping(value = "noticeWrite")
		public ModelAndView setInsert(NoticeVO noticeVO) throws Exception {
			ModelAndView mv = new ModelAndView();
			int result = noticeService.setInsert(noticeVO);
			String message = "fail";
			if (result < 0) {
				message = "success";
			}
			mv.setViewName("common/result");
			mv.addObject("msg", message);
			mv.addObject("path", "./noticeList");
			return mv;
		}
}
