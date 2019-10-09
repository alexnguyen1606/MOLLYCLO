package com.molly.dto;

public class ImageDTO extends BaseDTO {
    private String href;

    private ProductDTO product;


    private CollectionDTO collection;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public CollectionDTO getCollection() {
        return collection;
    }

    public void setCollection(CollectionDTO collection) {
        this.collection = collection;
    }
}
