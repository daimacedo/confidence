package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
	
	public ArrayList<String> lerArquivo(String path) throws IOException
	{
		ArrayList<String> submenus = new ArrayList<String>();
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String teste;
	    while((teste = br.readLine()) != null){
	           	 submenus.add(teste);
	         } 
	    return submenus;
	}
}
