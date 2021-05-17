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

import prayer.dao.MotiveDAO;
import prayer.pojo.Motive;

@Controller
public class MotiveController {

	@RequestMapping(value = "listMotive.htm", method = RequestMethod.GET)
	public ModelAndView listMotive() throws SQLException {
		ModelMap model = new ModelMap();

		ArrayList<Motive> motive = MotiveDAO.getMotive();
		model.put("motive", motive);

		return new ModelAndView("listMotive.jsp", model);
	}

	@RequestMapping(value = "detaliiMotive.htm", method = RequestMethod.GET)
	public ModelAndView detailsMotive(@RequestParam Integer id) throws SQLException {
		ModelMap model = new ModelMap();

		Motive mo = MotiveDAO.getMotiveByID(id);
		model.put("motive", mo);

		return new ModelAndView("detaliiMotive.jsp", model);
	}

	@RequestMapping(value = "adaugare-motive.htm", method = RequestMethod.GET)
	public ModelAndView showAddMotive(Model model) {
		Motive mo = new Motive();
		model.addAttribute("motive", mo);

		return new ModelAndView("addMotive.jsp", "model", model);
	}

	@RequestMapping(value = "adaugare-motive-save.htm", method = RequestMethod.POST)
	public ModelAndView addMotive(@ModelAttribute("motive") Motive mo, ModelMap model, BindingResult result) {

		try {
			MotiveDAO.createMotive(mo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/listMotive.htm");
	}

	@RequestMapping(value = "deleteMotive.htm", method = RequestMethod.GET)
	public ModelAndView deleteMotive(@RequestParam Integer id) throws SQLException {
		ModelMap model = new ModelMap();

		MotiveDAO.deleteMotive(id);

		return new ModelAndView("redirect:/listMotive.htm");
	}

	@RequestMapping(value = "editare-motive.htm", method = RequestMethod.GET)
	public ModelAndView editMotive(@RequestParam Integer id, Model model) throws SQLException {
		Motive mo = MotiveDAO.getMotiveByID(id);
		model.addAttribute("motiveForm", mo);
		return new ModelAndView("editMotive.jsp", "model", model);

	}

	@RequestMapping(value = "editare-motive-save.htm", method = RequestMethod.POST)
	public ModelAndView editMotive(@ModelAttribute("motiveForm") Motive mo, ModelMap model, BindingResult result) {

		try {
			MotiveDAO.updateMotive(mo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/listMotive.htm");
	}
}