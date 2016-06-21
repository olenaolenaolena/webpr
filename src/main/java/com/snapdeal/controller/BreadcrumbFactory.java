package com.snapdeal.controller;

import com.snapdeal.model.Breadcrumb;
import com.snapdeal.model.GenericModel;

public class BreadcrumbFactory {

	public static Breadcrumb getBreadcrumbs(final GenericModel productModel, String path){
		if (productModel.getName() == null || productModel.getName().isEmpty() || path == null
				|| path.isEmpty()) {
			throw new NullPointerException("product name or path is null");
		} else {
			return new Breadcrumb(productModel.getName(), path);
		}
	}
	
	public static Breadcrumb getBreadcrumbs(Pages page, String path) throws NullPointerException {
		if (page.toString().isEmpty()) {
			throw new NullPointerException("page name is empty");
		} else {
			return new Breadcrumb(page.toString(), path);
		}
	}

}
