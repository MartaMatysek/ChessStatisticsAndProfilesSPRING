package com.capgemini.chess.service;

import com.capgemini.chess.exception.UserValidationException;
import com.capgemini.chess.service.to.UpdateProfileTO;
import com.capgemini.chess.service.to.UserProfileTO;

public interface UserUpdateProfileService {
	
	UserProfileTO update(UpdateProfileTO updateProfileTO) throws UserValidationException;
}
