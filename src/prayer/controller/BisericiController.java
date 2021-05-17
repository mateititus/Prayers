package prayer.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import prayer.dao.BisericiDAO;
import prayer.pojo.Biserici;

@Controller
public class BisericiController {

	@RequestMapping(value = "listBiserici.htm", method = RequestMethod.GET)
	public ModelAndView listBiserici() throws SQLException {
		ModelMap model = new ModelMap();

		ArrayList<Biserici> biserici = BisericiDAO.getBiserici();
		model.put("biserici", biserici);

		return new ModelAndView("listBiserici.jsp", model);
	}

	@RequestMapping(value = "detaliiBiserici.htm", method = RequestMethod.GET)
	public ModelAndView detailsBiserici(@RequestParam Integer id) throws SQLException {
		ModelMap model = new ModelMap();

		Biserici bi = BisericiDAO.getBisericiByID(id);
		model.put("biserici", bi);

		return new ModelAndView("detaliiBiserici.jsp", model);
	}

	@RequestMapping(value = "adaugare-biserici.htm", method = RequestMethod.GET)
	public ModelAndView showAddBiserici(Model model) {
		Biserici bi = new Biserici();
		model.addAttribute("biserici", bi);

		return new ModelAndView("addBiserici.jsp", "model", model);
	}

	@RequestMapping(value = "adaugare-biserici-save.htm", method = RequestMethod.POST)
	public ModelAndView addBiserici(@ModelAttribute("biserici") Biserici bi, ModelMap model, BindingResult result) {

		try {
			BisericiDAO.createBiserici(bi);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/listBiserici.htm");
	}

	@RequestMapping(value = "deleteBiserici.htm", method = RequestMethod.GET)
	public ModelAndView deleteBiserici(@RequestParam Integer id) throws SQLException {
		ModelMap model = new ModelMap();

		BisericiDAO.deleteBiserici(id);

		return new ModelAndView("redirect:/listBiserici.htm");
	}

	@RequestMapping(value = "editare-biserici.htm", method = RequestMethod.GET)
	public ModelAndView editBiserici(@RequestParam Integer id, Model model) throws SQLException {
		Biserici bi = BisericiDAO.getBisericiByID(id);
		model.addAttribute("bisericiForm", bi);
		return new ModelAndView("editBiserici.jsp", "model", model);

	}

	@RequestMapping(value = "editare-biserici-save.htm", method = RequestMethod.POST)
	public ModelAndView editBiserici(@ModelAttribute("bisericiForm") Biserici bi, ModelMap model,
			BindingResult result) {

		try {
			BisericiDAO.updateBiserici(bi);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/listBiserici.htm");
	}
}