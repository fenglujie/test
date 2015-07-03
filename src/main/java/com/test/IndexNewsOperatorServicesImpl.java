package com.test;

import org.apache.thrift.TException;

public class IndexNewsOperatorServicesImpl implements IndexNewsOperatorServices.Iface{

	@Override
	public boolean indexNews(NewsModel indexNews) throws TException {
		return false;
	}

	@Override
	public boolean deleteArtificiallyNews(int id) throws TException {
		return false;
	}

}
