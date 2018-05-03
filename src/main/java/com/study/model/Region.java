/**
 * <p>Title: region.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.model;

/**
 * @author linmeng
 *
 */
public class Region {
	private Integer id;
	private String host;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Region(Integer id, String host) {
		super();
		this.id = id;
		this.host = host;
	}
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Region [id=" + id + ", host=" + host + "]";
	}
}
