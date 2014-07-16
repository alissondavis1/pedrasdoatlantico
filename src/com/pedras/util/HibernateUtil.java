package com.pedras.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static final SessionFactory sessao = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		
		try{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		
		return cfg.buildSessionFactory();
		}catch(Throwable e){
			
			System.out.println("Erro ao iniciar a sessão!");
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessao(){
		
		return sessao;
		
	}

}
