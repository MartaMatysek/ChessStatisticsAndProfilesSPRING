package com.capgemini.chess.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.chess.exception.UserValidationException;
import com.capgemini.chess.service.Facade;
import com.capgemini.chess.service.to.RankingTO;
import com.capgemini.chess.service.to.UserProfileTO;

@Service
public class FacadeImpl implements Facade {
	
	@Autowired
	private RankingServiceImpl rankingService;
	@Autowired
	private UpdateUserServiceImpl updateUserService;

	@Override
	public RankingTO getRanking(Long id) throws UserValidationException {
		return rankingService.getRanking(id);
	}

	@Override
	public UserProfileTO updateProfile(UserProfileTO userProfileTO) throws UserValidationException {
		return updateUserService.updateProfile(userProfileTO);
	}

}
