package com.consumers.suppliers;
import java.util.function.Consumer;
public class Consumers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s->System.out.println(s);
		c.accept("Hii");
		c.accept("Hello");
			
		}

	}

