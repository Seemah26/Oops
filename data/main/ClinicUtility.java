package com.bridgelabz.data.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

public class ClinicUtility {

	private static Scanner s = new Scanner(System.in);
	private static ObjectMapper objectMapper = new ObjectMapper();

	public static int getInt() {
		return s.nextInt();
	}

	public static double getDouble() {
		return s.nextDouble();
	}

	public static boolean getBoolean() {
		return s.nextBoolean();
	}

	public static String getString() {
		return s.next();
	}

	public static float getFloat() {
		return s.nextFloat();
	}

	public static long getLong() {
		return s.nextLong();
	}

	public static String readJsonFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String line = "";
		while ((line = br.readLine()) != null) {
			str += line;
		}
		br.close();
		return str;
	}

	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}

	public static <T> void writeToFile(String filename, List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		
		String jsonString = userWriteValueAsString(list);
		writeFile(jsonString, filename);
	}

	public static <T> String userWriteValueAsString(List<T> list) throws IOException {
		return objectMapper.writeValueAsString(list);
	}

	public static <T> List<T> userReadValue(String str, Class<?> clazz) throws IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}

}
