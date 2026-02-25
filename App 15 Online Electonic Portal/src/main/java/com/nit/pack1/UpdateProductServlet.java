package com.nit.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.valves.rewrite.RewriteCond;

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			throw new RuntimeException("Sessrion Expired!!");
		} else {
			String p_price = req.getParameter("pprice");
			String p_qty = req.getParameter("pqty");
			String p_code = req.getParameter("pcode");

			ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("productList");
			Iterator<ProductBean> i = al.iterator();
			ProductBean pb = null;
			while (i.hasNext()) {
				pb = i.next();
				if (p_code.equals(pb.getP_code())) {
					break;
				}
			}
			pb.setP_price(p_price);
			pb.setP_qty(p_qty);

			int rowCount = new UpdateProductDAO().updateProduct(pb);
			if (rowCount > 0) {
				req.setAttribute("msg", "Product Inventory Update Sucessfully!!!!!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}else {
				req.setAttribute("msg", "Product Inventory Updation Faild!!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}

		}
	}
}
