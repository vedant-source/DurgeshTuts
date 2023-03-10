package prodapp_project.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import prodapp_project.dao.ProductDao;
import prodapp_project.dto.Product;

@Controller
public class HomeController {

	@Autowired
	private ProductDao productDao;

	// Index Page
	@RequestMapping("/home")
	public String showHomePage(Model m) {
		System.out.println("showHomePage Handler Worked...");
		List<Product> allProducts = productDao.getAllProducts();
		System.out.println(allProducts);
		m.addAttribute("allProductList", allProducts);
		return "index";
	}

	// Form to Add new Prod
	@RequestMapping("/addProduct")
	public String addProductForm(Model m) {
		m.addAttribute("title", "Add Product");
		return "addProductForm";
	}

	// Handle Added new prod
	@RequestMapping(path = "/handleProd", method = RequestMethod.POST)
	public RedirectView handleProd(@ModelAttribute Product product, HttpServletRequest request) {
		RedirectView redirectView = new RedirectView();
		System.out.println("handleProd"+product);
		productDao.createProduct(product);
		redirectView.setUrl(request.getContextPath() + "/home");
		return redirectView;
	}

	@RequestMapping("/delete/{productId}")
	public RedirectView handleDelete(@PathVariable("productId") int productId, HttpServletRequest request) {
		productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/home");
		return redirectView;
	}

	@RequestMapping("/update/{productId}")
	public String handleUpdate(@PathVariable("productId") int productId, Model model) {
		Product prod = this.productDao.getSingleProduct(productId);
		System.out.println("UPDATE" + prod);
		model.addAttribute("product", prod);
		return "updateForm";
	}
	
//	@RequestMapping(path = "/updateProd", method = RequestMethod.POST)
//	public RedirectView handleProdUpdate(@ModelAttribute Product product, HttpServletRequest request) {
//		RedirectView redirectView = new RedirectView();
//	
//		productDao.updateProduct(product);
//		
//		redirectView.setUrl(request.getContextPath() + "/");
//		return redirectView;
//	}	
}
