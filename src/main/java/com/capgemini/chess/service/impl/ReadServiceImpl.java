package com.capgemini.chess.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.chess.service.ReadService;
import com.capgemini.chess.service.access.dao.UserDao;
import com.capgemini.chess.service.to.UserStatisticsTO;

@Service
public class ReadServiceImpl implements ReadService {

	private UserDao userDao;
	
	@Autowired
	public ReadServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<UserStatisticsTO> readRanking(){
		List<UserStatisticsTO> listOfUserStatistics = userDao.readRanking();
		return listOfUserStatistics;
	}

	@Override
	public UserStatisticsTO readUserStatistics(Long id) {
		UserStatisticsTO userStatisticsTO = userDao.readUserStatistics(id);
		return userStatisticsTO;
	}
	
}
