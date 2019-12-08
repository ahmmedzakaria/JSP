package com.apress.projsp.store;

import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;


public class ConfirmAction implements Action {
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
            System.out.println("here.........");
            HttpSession session = request.getSession();
            session.setAttribute("cart", null);
            session.invalidate();
//            Cart cart = (Cart) session.getAttribute("cart");
//            Iterator iterator=cart.getItems();
//            while(iterator.hasNext()){
//                System.out.println(iterator.next());
//            iterator.remove();
//            }
		return "/confirmed.jsp";
	}
}
