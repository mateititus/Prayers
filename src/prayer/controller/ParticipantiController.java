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

import prayer.dao.ParticipantiDAO;
import prayer.pojo.Participanti;

@Controller
public class ParticipantiController {

	@RequestMapping(value = "listParticipanti.htm", method = RequestMethod.GET)
	public ModelAndView listParticipanti() throws SQLException {
		ModelMap model = new ModelMap();

		ArrayList<Participanti> participanti = ParticipantiDAO.getParticipanti();
		model.put("participanti", participanti);

		return new ModelAndView("listParticipanti.jsp", model);
	}

	@RequestMapping(value = "detaliiParticipanti.htm", method = RequestMethod.GET)
	public ModelAndView detailsParticipanti(@RequestParam Integer id) throws SQLException {
		ModelMap model = new ModelMap();

		Participanti pa = ParticipantiDAO.getParticipantiByID(id);
		model.put("participanti", pa);

		return new ModelAndView("detaliiParticipanti.jsp", model);
	}

	@RequestMapping(value = "adaugare-participanti.htm", method = RequestMethod.GET)
	public ModelAndView showAddParticipanti(Model model) {
		Participanti pa = new Participanti();
		model.addAttribute("participanti", pa);

		return new ModelAndView("addParticipanti.jsp", "model", model);
	}

	@RequestMapping(value = "adaugare-participanti-save.htm", method = RequestMethod.POST)
	public ModelAndView addParticipanti(@ModelAttribute("participanti") Participanti pa, ModelMap model,
			BindingResult result) {

		try {
			ParticipantiDAO.createParticipanti(pa);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/listParticipanti.htm");
	}

	@RequestMapping(value = "deleteParticipanti.htm", method = RequestMethod.GET)
	public ModelAndView deleteParticipanti(@RequestParam Integer id) throws SQLException {
		ModelMap model = new ModelMap();

		ParticipantiDAO.deleteParticipanti(id);

		return new ModelAndView("redirect:/listParticipanti.htm");
	}

	@RequestMapping(value = "editare-participanti.htm", method = RequestMethod.GET)
	public ModelAndView editParticipanti(@RequestParam Integer id, Model model) throws SQLException {
		Participanti pa = ParticipantiDAO.getParticipantiByID(id);
		model.addAttribute("participantiForm", pa);
		return new ModelAndView("editParticipanti.jsp", "model", model);

	}

	@RequestMapping(value = "editare-participanti-save.htm", method = RequestMethod.POST)
	public ModelAndView editParticipanti(@ModelAttribute("participantiForm") Participanti pa, ModelMap model,
			BindingResult result) {

		try {
			ParticipantiDAO.updateParticipanti(pa);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/listParticipanti.htm");
	}
}