package com.utn.vista;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		String separator = ";";
		BufferedReader lector;
		String line = " ";
		String [] resultado = {" "};
		Charset cs = Charset.defaultCharset();
		Path archivo = Paths.get("C:\\Users\\Java\\eclipse-workspace\\Leer Archivo .csv\\Datos.csv");
		try {
			lector = Files.newBufferedReader(archivo,cs);
			while(resultado != null) {
				line = lector.readLine();	
				resultado = line.split(separator);
				for (int i = 0; i < resultado.length; i++) {
					System.out.println(resultado[i]);									
				}
			}
			Persona persona = null;
			String nombre = null;
			String apellido = null;
			int edad = 0;
			String profesion = null;
			persona = new Persona (resultado[0], resultado[1], resultado[2], resultado[3]);
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
	

}
