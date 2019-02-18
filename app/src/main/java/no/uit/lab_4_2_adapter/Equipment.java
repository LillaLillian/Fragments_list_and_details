package no.uit.lab_4_2_adapter;

public class Equipment {
    private String type;
    private String manufacturer;
    private String model;
    private String boughtOn;
    private boolean onLoan;
    private String loanedTo;
    private int imageRef;


    public Equipment(String type, String manufacturer, String model, String boughtOn) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.boughtOn = boughtOn;
        this.onLoan = false;
        this.imageRef = R.drawable.ic_equipment_image;
        this.loanedTo = "";
    }

    public Equipment(String type, String manufacturer, String model, String boughtOn, boolean onLoan, String loanedTo, int imageRef) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.boughtOn = boughtOn;
        this.onLoan = onLoan;
        this.loanedTo = loanedTo;
        this.imageRef = imageRef;
    }

    public int getImageRef() {
        return imageRef;
    }

    public void setImageRef(int imageRef) {
        this.imageRef = imageRef;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoughtOn() {
        return boughtOn;
    }

    public void setBoughtOn(String boughtOn) {
        this.boughtOn = boughtOn;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public String getLoanedTo() {
        return loanedTo;
    }

    public void setLoanedTo(String loanedTo) {
        this.loanedTo = loanedTo;
    }


}
