package com.cts.parlour.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.cts.parlour.model.Product;
import com.cts.parlour.model.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	
	private EntityManager entityManager;
	
	@Autowired
	public MyDataRestConfig(EntityManager theEntityManager) {
		entityManager = theEntityManager;
		
	}
	
	
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		HttpMethod[] theUnsupportedActions= {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		config.getExposureConfiguration().forDomainType(Product.class)
        .withItemExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActions))
        .withCollectionExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActions));
		        
        
        
        config.getExposureConfiguration()
	    .forDomainType(ProductCategory.class)
	    .withItemExposure((metadata,httpMethods) ->httpMethods.disable(theUnsupportedActions))
        .withCollectionExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActions));
        
        
        //call an internal helper method
        exposeIds(config);
	
	}
	
	private void exposeIds(RepositoryRestConfiguration config) {
		//expose entity ids 
		
		Set<EntityType<?>> entities =entityManager.getMetamodel().getEntities();
		
		List<Class> entityClasses = new ArrayList<>();
		
		for(EntityType tempEntity: entities) {
			entityClasses.add(tempEntity.getJavaType());
		}
		
		Class[] domainType = entityClasses.toArray(new Class[0]);
		config.exposeIdsFor(domainType);
	}

	
}
