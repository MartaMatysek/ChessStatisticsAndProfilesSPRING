package com.capgemini.chess.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.chess.exception.MatchValidationException;
import com.capgemini.chess.exception.UserValidationException;
import com.capgemini.chess.service.Facade;
import com.capgemini.chess.service.to.MatchTO;
import com.capgemini.chess.service.to.RankingTO;
import com.capgemini.chess.service.to.UpdateProfileTO;
import com.capgemini.chess.service.to.UserProfileTO;

@Controller
@ResponseBody
public class FacadeRest{
	
	@Autowired
	private Facade facade;
	
	@RequestMapping(value = "/readRanking/{id}", method= RequestMethod.GET)
	public RankingTO readRanking(@PathVariable("id") Long id) throws UserValidationException {
		return facade.getRanking(id);
	}
	
	@RequestMapping(value = "/saveMatch", method= RequestMethod.POST)
	public MatchTO registerNewMatch(@RequestBody MatchTO match) throws UserValidationException, MatchValidationException{
		return facade.registerMatch(match);
	}

	@RequestMapping(value = "/updateProfile", method= RequestMethod.POST)
	public UserProfileTO updateProfile(@RequestBody UpdateProfileTO user) throws UserValidationException{
		return facade.updateProfile(user);
	}
	
} 