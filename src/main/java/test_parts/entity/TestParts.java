package test_parts.entity;
// Generated Feb 27, 2016 7:36:54 PM by Hibernate Tools 4.3.1



/**
 * TestParts generated by hbm2java
 */
public class TestParts  implements java.io.Serializable {


     private Integer testPartId;
     private String testPartName;
     private String testPartDesc;
     private double testPartPrice;

    public TestParts() {
    }

    public TestParts(String testPartName, String testPartDesc, double testPartPrice) {
       this.testPartName = testPartName;
       this.testPartDesc = testPartDesc;
       this.testPartPrice = testPartPrice;
    }
   
    public Integer getTestPartId() {
        return this.testPartId;
    }
    
    public void setTestPartId(Integer testPartId) {
        this.testPartId = testPartId;
    }
    public String getTestPartName() {
        return this.testPartName;
    }
    
    public void setTestPartName(String testPartName) {
        this.testPartName = testPartName;
    }
    public String getTestPartDesc() {
        return this.testPartDesc;
    }
    
    public void setTestPartDesc(String testPartDesc) {
        this.testPartDesc = testPartDesc;
    }
    public double getTestPartPrice() {
        return this.testPartPrice;
    }
    
    public void setTestPartPrice(double testPartPrice) {
        this.testPartPrice = testPartPrice;
    }




}


