package br.personal.soa;

import javax.jws.WebService;

@WebService(targetNamespace = "http://soa.personal.br/", portName = "CalculadoraPort", serviceName = "CalculadoraService")
public class Calculadora {
	
	// Básico //
	public double somar(double a, double b) {
		return a+b;
	}
	
	public double subtrair(double a, double b) {
		return a-b;
	}

	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	public double dividir(double a, double b) {
		return a/b;
	}
	
	// 5 funções extras  //
	
	public double sen(double a) {
		return Math.sin(a);
	}
	
	public double cos(double a) {
		return Math.cos(a);
	}
	
	public double tg(double a) {
		return Math.tan(a);
	}
	
	public double pow(double a, double b) {
		return Math.pow(a, b);
	}
	
	public double sqrt(double a) {
		return Math.sqrt(a);
	}
}

