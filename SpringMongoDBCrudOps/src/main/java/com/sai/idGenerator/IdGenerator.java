package com.sai.idGenerator;

import java.util.UUID;

public class IdGenerator {
	public static String generateId() {
		return UUID.randomUUID().toString().substring(0,5);
	}
}
