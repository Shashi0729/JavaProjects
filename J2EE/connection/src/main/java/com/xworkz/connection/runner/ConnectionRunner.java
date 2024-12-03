package com.xworkz.connection.runner;

import com.xworkz.connection.util.ConnectionUtil;

public class ConnectionRunner {
public static void main(String[] args) {
	try {
		Class.forName(ConnectionUtil.DRIVERNAME);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
