package com.responsi.mvp.model;

import java.util.List;

public class People{
	private List<ResultsItem> results;
	private Info info;

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"People{" + 
			"results = '" + results + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}