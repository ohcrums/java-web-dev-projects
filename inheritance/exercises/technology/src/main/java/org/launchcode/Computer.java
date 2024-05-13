package org.launchcode;

public class Computer extends AbstractEntity {
    private String unitName;
    private Double ageInYears;
    private Double warrantyLength;
    private boolean warrantyStatus = true;
    private boolean damageCoverage;

    public Computer(String unitName, Double ageInYears, Double warrantyLength, boolean damageCoverage) {
        this.ageInYears = ageInYears;
        this.warrantyLength = warrantyLength;
        this.damageCoverage = damageCoverage;
        this.unitName = unitName;
        registerId(unitName);
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Double getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(Double ageInYears) {
        this.ageInYears = ageInYears;
    }

    public Double getWarrantyLength() {
        return warrantyLength;
    }

    public void setWarrantyLength(Double warrantyLength) {
        this.warrantyLength = warrantyLength;
    }

    public boolean isWarrantyStatus() {
        return warrantyStatus;
    }

    public void setWarrantyStatus(boolean warrantyStatus) {
        this.warrantyStatus = warrantyStatus;
    }

    public boolean isDamageCoverage() {
        return damageCoverage;
    }

    public void setDamageCoverage(boolean damageCoverage) {
        this.damageCoverage = damageCoverage;
    }
// methods

    public boolean warrantyCheck(){
        if (this.ageInYears >= this.warrantyLength){
            this.warrantyStatus = false;
        }

        return this.warrantyStatus;
    }

    public void voidWarranty(){
        this.warrantyStatus = false;
    }

    public boolean isRepairFree(boolean damaged) {
       System.out.print("The technician tells you: '");
        if (warrantyCheck()){
            // in warranty
            if (damaged){
                // with damage
                if (this.damageCoverage){
                    // and damage coverage
                    System.out.println("Damaged unit with coverage, so warranty is still valid.'");
                    return true;
                } else {
                    // and no damage coverage
                    voidWarranty();
                    System.out.println("Warranty active, but unit is damaged and has no damage coverage, so warranty is void.'");
                    return false;
                }
            } else {
                // without damage
                System.out.println("No damage and unit is in warranty.'");
                return true;
            }
        } else {
            // out of warranty
            if (damaged) {
                System.out.println("Well it's damaged, and it's out of warranty anyway...'");
            } else {
                System.out.println("No damage, but unit is out of warranty.'");
            }
            return false;
        }
    }


    public void powerOn(){
        System.out.println("Unit powered on.");
    }

    public void checkStatus(){
        System.out.println("System status");
    }

    public void describeUsage(){
        System.out.println("this is a __ and is best used for __");
    }


}
