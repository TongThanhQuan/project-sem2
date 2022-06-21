package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import dao.GenDao;
import dao.ImplCategoryDAO;
import dao.ImplProductDAO;
import entity.Category;
import entity.Product;

@SuppressWarnings("hiding")
@Controller
@RequestMapping("/category")
public class CategoryController<Gson> {
	@RequestMapping("list")
	public String select(Model m) {
		GenDao<Category> catDao = new ImplCategoryDAO();
		List<Category> lstCat = catDao.select();

		m.addAttribute("lstCat", lstCat);

		return "category/list";
	}
	
	@RequestMapping("init-add")
	public String initInsert(Model m) {

		GenDao<Category> catDao = new ImplCategoryDAO();
		List<Category> lstCat = catDao.select();

		m.addAttribute("lstCat", lstCat);


		return "category/add";
	}
	@RequestMapping("/add")
	public String insert(@Valid @ModelAttribute("cat") Category catAdd, BindingResult result,
			MultipartFile mf, HttpServletRequest request, Model m) {
		// Đẩy chuyển tiếp dữ liệu tới trang tiếp theo
		m.addAttribute("catAdd", catAdd);


			// Tích hợp Hibernate để thêm dữ liệu vào database
			GenDao<Category> catDAO = new ImplCategoryDAO();
			boolean isOK = catDAO.insert(catAdd);
			if (isOK) {
				m.addAttribute("msgOk", "Thêm dữ liệu thành công");
			} else {
				m.addAttribute("msgError", "Thất bại là MẸ thành công!");
			}
		

		return "category/add";
	}
	
	
	
}
