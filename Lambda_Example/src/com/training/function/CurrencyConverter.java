package com.training.function;

@FunctionalInterface
public interface CurrencyConverter<T,R> { //T = input , R = Return type
	public T convert(T t);
}
