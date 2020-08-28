/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling;

/**
 *
 * @author youssef
 */
public class ModulePart {
    private String partName;
    private int partCode;
    private Duration partDuration = new Duration();

    public ModulePart(String partName, int partCode) {
        this.partName = partName;
        this.partCode = partCode;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getPartCode() {
        return partCode;
    }

    public void setPartCode(int partCode) {
        this.partCode = partCode;
    }

    public Duration getPartDuration() {
        return partDuration;
    }

    public void setPartDuration(Duration partDuration) {
        this.partDuration = partDuration;
    }
    
    
}
