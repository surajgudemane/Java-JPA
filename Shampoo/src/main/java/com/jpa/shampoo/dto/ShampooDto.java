package com.jpa.shampoo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "shampoo_info")
@NamedQuery(name = "readAll", query = "Select read from ShampooDto read")
@NamedQuery(name = "readName", query = "Select read from ShampooDto read where read.useFor =: useFor")
@NamedQuery(name = "update", query = "update ShampooDto up set up.ml =: ml where up.price =: price")
@NamedQuery(name = "delete", query = "delete from ShampooDto del where del.name =: name")
public class ShampooDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int ml;
	private String useFor;
	private int price;

	public ShampooDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShampooDto(String name, int ml, String useFor, int price) {
		super();
		this.name = name;
		this.ml = ml;
		this.useFor = useFor;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShampooDto [id=" + id + ", name=" + name + ", ml=" + ml + ", useFor=" + useFor + ", price=" + price
				+ "]";
	}

	
//	Email finder
//	
//	var request;
//	function sendInfo(){  
//		var email=document.vinform.email.value;  
//		var url="fileName.jsp?email="+email;  
//	  
//		if(window.XMLHttpRequest){  
//				request=new XMLHttpRequest();  
//		} else if(window.ActiveXObject){  
//				request=new ActiveXObject("Microsoft.XMLHTTP");  
//		}  
//	try{  
//		request.onreadystatechange=getInfo;  
//		request.open("GET",url,true);  
//		request.send();  
//	}catch(e){
//		alert("Unable to connect to server");}  
//	}
//	
//	function getInfo(){  
//		if(request.readyState==4){  
//				var val=request.responseText;  
//				document.getElementById('mylocation').innerHTML=val;  
//		}  
//	}

}
