package model;

/* You must supply this package ????; */


import java.text.NumberFormat;
import java.io.Serializable;

public class Product implements Serializable {

    //private Long productId;    
    private String code;
    private String description;
    private Double price;

    public Product() {}

    //public Long getProductId() {
        //return productId;
    //}

    public void setProductId(Long productId) {
        //this.productId = productId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getArtistName() {
        String artistName = 
                description.substring(0, description.indexOf(" - "));
        return artistName;
    }

    public String getAlbumName() {
        String albumName = 
                description.substring(description.indexOf(" - ") + 3);
        return albumName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

 
    public String getPriceCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String getImageURL() {
        String imageURL = "/musicStore/images/" + code + "_cover.jpg";
        return imageURL;
    }

    public String getProductType() {
        return "Audio CD";
    }
}
