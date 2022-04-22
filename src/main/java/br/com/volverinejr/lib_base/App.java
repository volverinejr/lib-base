package br.com.volverinejr.lib_base;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 * File > New > Outros > Maven Project
 * maven-central 
 * filtro: maven-archetype-quickstart
 * Configurar Build Path, pasta resources 
 * */

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class App {
	public static void main(String[] args) {
	}
}
