package com.tortuesoft.service.data;

public class DataProviderFactory {
	public static DataProvider getDataProvider(boolean _isMock){
		return _isMock ? new DataProviderMock() : new DataProviderByJpa();
	}

}
