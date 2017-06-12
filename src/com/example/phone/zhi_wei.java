/**
 * 
 */
/**
 * @author wangshuai
 *
 */
package com.example.phone;

public class zhi_wei extends org.litepal.crud.DataSupport{
	private int id;
	private String zhi_weiName;//职位名称
	private int zhi_weiId;//职位代号
	private int bu_menId;//职位所属部门的代号
	public int getId(){
		return id;
			}
	public void setId(int id){
		this.id=id;
	}
	public String getProvinceName(){
		return zhi_weiName;
	}
	public void setProvinceName(String provinceName){
			this .zhi_weiName=provinceName;
		}
	public int getProvinceCode(){
		return zhi_weiId;
	}
	public void setProvinceCode(int provinceCode){
		this.zhi_weiId=provinceCode;
	}
	public int getgong_siId(){
		return bu_menId;
		}
	public void setgong_siId(int gong_siId){
		this.bu_menId=gong_siId;
	}
	}
