package com.foodApp.foodAppApi.model;

public class slider {
    private String slideId;
    private String slideName;
    private String slideDescription;
    private String slideLink;
    private boolean isSlideActive;
    
    public boolean isSlideActive() {
        return isSlideActive;
    }

    public void setSlideActive(boolean isSlideActive) {
        this.isSlideActive = isSlideActive;
    }

    public slider() {
    }

    public String getSlideId() {
        return slideId;
    }

    public void setSlideId(String slideId) {
        this.slideId = slideId;
    }

    public String getSlideName() {
        return slideName;
    }

    public void setSlideName(String slideName) {
        this.slideName = slideName;
    }

    public String getSlideDescription() {
        return slideDescription;
    }

    public void setSlideDescription(String slideDescription) {
        this.slideDescription = slideDescription;
    }

    public String getSlideLink() {
        return slideLink;
    }

    public void setSlideLink(String slideLink) {
        this.slideLink = slideLink;
    }

    public slider(String slideId, String slideName, String slideDescription, String slideLink, boolean isSlideActive) {
        this.slideId = slideId;
        this.slideName = slideName;
        this.slideDescription = slideDescription;
        this.slideLink = slideLink;
        this.isSlideActive = isSlideActive;
    }
}
