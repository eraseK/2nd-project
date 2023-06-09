package com.mystudy.Project_shop.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.Project_shop.dao.ShopDAO;
import com.mystudy.Project_shop.vo.reviewCommentsVO;

public class cmtUpdateCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bNum = Integer.parseInt(request.getParameter("bNum"));
		int cNum = Integer.parseInt(request.getParameter("cNum"));
		String cPage = request.getParameter("cPage");
		String id = request.getParameter("id");
		reviewCommentsVO rcvo = new reviewCommentsVO();
		
		
		
		int cmtUp = ShopDAO.cmtUpdate(rcvo);
		
		System.out.println("cmtUp : " + cmtUp);
		
		request.setAttribute("cmtUp", cmtUp);
		
		return "Rview.jsp?id=" + id + "&cPage=" + cPage + "&bNum=" + bNum;
	}

}
