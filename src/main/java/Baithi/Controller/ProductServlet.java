package Baithi.Controller;

import Baithi.model.Product;
import Baithi.service.IUProductDAO;
import Baithi.service.IUProductDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/Product")
public class ProductServlet extends HttpServlet {
    IUProductDAO iuProductDAO = new IUProductDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {

            default:
                showList(request, response);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/listProduct.jsp");
        String key = request.getParameter("key");
        List<Product> products = iuProductDAO.findAll();
        if (key == null){
            products = iuProductDAO.findAll();
        }
        else {

            products =  iuProductDAO.findAllByName(key);
        }
        request.setAttribute("dssp", products);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
