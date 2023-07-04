package com.thinkconstructive.restdemo.model;

public class CloudVendor
{
   private String vendorId;
   private String vendorName;
   private String vendorAddress;
   private String vendorphoneNumber;

   public CloudVendor() {
   }

public CloudVendor(String vendorId,String vendorName,String vendorAddress,String vendorphoneNumber){
    this.vendorId = vendorId;
    this.vendorName = vendorName;
    this.vendorAddress = vendorAddress;
    this.vendorphoneNumber = vendorphoneNumber;
}

public String getVendorId() {
    return vendorId;
}

public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
}

public String getVendorName() {
    return vendorName;
}

public void setVendorName(String vendorName){
    this.vendorName =vendorName;
}

public String getVendorAddress(){
    return vendorAddress;
}

public void setVendorAddress(String vendorAddres){
    this.vendorAddress =vendorAddres;
}

public String  getVendorvendorphoneNumber(){
    return vendorphoneNumber;
}

public void setVendorphoneNumber(){
    this.vendorphoneNumber =vendorphoneNumber;
}

}



