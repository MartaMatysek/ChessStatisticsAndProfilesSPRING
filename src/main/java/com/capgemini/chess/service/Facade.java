package com.capgemini.chess.service;

import com.capgemini.chess.exception.UserValidationException;
import com.capgemini.chess.service.to.RankingTO;
import com.capgemini.chess.service.to.UserProfileTO;

public interface Facade {
	
	RankingTO getRanking(Long id) throws UserValidationException;
	
	UserProfileTO updateProfile(UserProfileTO userProfileTO) throws UserValidationException;
}
