/**
 * 
 */
/**
 * @author wangshuai
 *
 */
package com.example.phone;

public class gong_si extends org.litepal.crud.DataSupport{
	private int id;
	private String gong_siName;//公司名称
	private int gong_siCode;//公司代号
	public int getId(){
		return id;
			}//生成getter方法
	public void setId(int id){
		this.id=id;
	}//生成setter方法
	public String getProvinceName(){
		return gong_siName;
	}
	public void setProvinceName(String provinceName){
			this .gong_siName=provinceName;
		}
	public int getProvinceCode(){
		return gong_siCode;
	}
	public void setProvinceCode(int provinceCode){
		this.gong_siCode=provinceCode;
	}
	}
