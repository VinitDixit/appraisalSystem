package com.project1.appraisal.service.transformer;

/**
 * Transforms TO to JPA entity and vise-versa
 * T- JPA entity
 * R- TO object/POJO object
 * 
 * @author DELL
 *
 * @param <T>
 * @param <R>
 */
public interface Transformer<T,R> {
	/**
	 * Transforms TO to JPA entity object
	 * @param r
	 * @return
	 */
	T transformEntity(R r);
	
	/**
	 * Transforms JPA entity to TO object
	 * @param t
	 * @return
	 */
	R transformTO(T t);

}
