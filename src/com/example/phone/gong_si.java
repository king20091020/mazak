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
	private String gong_siName;//��˾����
	private int gong_siCode;//��˾����
	public int getId(){
		return id;
			}//����getter����
	public void setId(int id){
		this.id=id;
	}//����setter����
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
