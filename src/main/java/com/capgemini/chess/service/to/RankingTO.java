package com.capgemini.chess.service.to;

import java.util.List;

public class RankingTO {

	private int userRankingPosition;
	private int userLevel;
	private List<UserStatisticsTO> listOfUsersStatistics;

	public int getUserRankingPosition() {
		return userRankingPosition;
	}

	public void setUserRankingPosition(int userRankingPosition) {
		this.userRankingPosition = userRankingPosition;
	}

	public int getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	public List<UserStatisticsTO> getListOfUsersStatistics() {
		return listOfUsersStatistics;
	}

	public void setListOfUsersStatistics(List<UserStatisticsTO> listOfUsersStatistics) {
		this.listOfUsersStatistics = listOfUsersStatistics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfUsersStatistics == null) ? 0 : listOfUsersStatistics.hashCode());
		result = prime * result + userLevel;
		result = prime * result + userRankingPosition;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RankingTO other = (RankingTO) obj;
		if (listOfUsersStatistics == null) {
			if (other.listOfUsersStatistics != null)
				return false;
		} else if (!listOfUsersStatistics.equals(other.listOfUsersStatistics))
			return false;
		if (userLevel != other.userLevel)
			return false;
		if (userRankingPosition != other.userRankingPosition)
			return false;
		return true;
	}
	
}
