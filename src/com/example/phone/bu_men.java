/**
 * 
 */
/**
 * @author wangshuai
 *
 */
package com.example.phone;

public class bu_men extends org.litepal.crud.DataSupport{
	private int id;
	private String bu_menName;//��������
	private int bu_menCode;//���Ŵ���
	private int gong_siId;//����������˾�Ĵ���
	public int getId(){
		return id;
			}
	public void setId(int id){
		this.id=id;
	}
	public String getProvinceName(){
		return bu_menName;
	}
	public void setProvinceName(String provinceName){
			this .bu_menName=provinceName;
		}
	public int getProvinceCode(){
		return bu_menCode;
	}
	public void setProvinceCode(int provinceCode){
		this.bu_menCode=provinceCode;
	}
	public int getgong_siId(){
		return gong_siId;
		}
	public void setgong_siId(int gong_siId){
		this.gong_siId=gong_siId;
	}
	}
