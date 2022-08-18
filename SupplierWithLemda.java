package com.rahul.java8Features.supplierFunctionalInterface;

import java.util.function.Supplier;

public class SupplierWithLemda 
	{
		public static void main(String[] args) 
		{
			Supplier<String> spl = ()->"Hi java example supplier interface with lemda ";
			System.out.println(spl.get());
System.out.println(spl.get());//https://github.com/Rahul-197/java8NewFeatures.git
		}
	}