package com.nt.exception;

public class UserBlockedException extends Exception{

	public  UserBlockedException() {}

	public  UserBlockedException(String errDesc) {
		super(errDesc);
	}
}
