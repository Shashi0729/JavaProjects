package com.xworkz.inherite.things;

public class Whatsapp extends Object {
public int id;
public float version;
public String Appname ;
public long contactno ;
public double size;
public boolean inuse;
public byte forword;


public int hashcode() {
	return id*7 + Appname.hashCode()+(contactno == 0 ? 0:12) + (int)size + (inuse ? 10:0)+ (int)version + forword ;
}


}
