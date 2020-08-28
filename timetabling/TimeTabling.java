/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling;

import java.util.ArrayList;

/**
 *
 * @author youssef
 */
public class TimeTabling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputGUI inputGUI = new InputGUI();
        inputGUI.setVisible(true);
    }
    public static ArrayList<Duration> findAvalibleDurationOverDays(ArrayList<ArrayList<Duration>> studentsDuarations){
        ArrayList<Duration> avalibleDuration = new ArrayList<Duration>();
        int latestStartTime = studentsDuarations.get(0).get(0).getStart();
        int earliestEndTime = studentsDuarations.get(0).get(0).getEnd();
        for(int i = 1 ; i<studentsDuarations.size() ; i++){
            if(latestStartTime < studentsDuarations.get(i).get(0).getStart()){
                latestStartTime = studentsDuarations.get(i).get(0).getStart();
            }
            if(earliestEndTime > studentsDuarations.get(i).get(0).getEnd()){
                earliestEndTime = studentsDuarations.get(i).get(0).getEnd();
            }
        }
        Duration d = new Duration();
        d.setStart(latestStartTime);
        d.setEnd(earliestEndTime);
        avalibleDuration.add(d);
        latestStartTime = studentsDuarations.get(0).get(1).getStart();
        earliestEndTime = studentsDuarations.get(0).get(1).getEnd();
        for(int i = 1 ; i<studentsDuarations.size() ; i++){
            if(latestStartTime < studentsDuarations.get(i).get(1).getStart()){
                latestStartTime = studentsDuarations.get(i).get(1).getStart();
            }
            if(earliestEndTime > studentsDuarations.get(i).get(1).getEnd()){
                earliestEndTime = studentsDuarations.get(i).get(1).getEnd();
            }
        }
        d.setStart(latestStartTime);
        d.setEnd(earliestEndTime);
        avalibleDuration.add(d);
        latestStartTime = studentsDuarations.get(0).get(2).getStart();
        earliestEndTime = studentsDuarations.get(0).get(2).getEnd();
        for(int i = 1 ; i<studentsDuarations.size() ; i++){
            if(latestStartTime < studentsDuarations.get(i).get(2).getStart()){
                latestStartTime = studentsDuarations.get(i).get(2).getStart();
            }
            if(earliestEndTime > studentsDuarations.get(i).get(2).getEnd()){
                earliestEndTime = studentsDuarations.get(i).get(2).getEnd();
            }
        }
        d.setStart(latestStartTime);
        d.setEnd(earliestEndTime);
        avalibleDuration.add(d);
        latestStartTime = studentsDuarations.get(0).get(3).getStart();
        earliestEndTime = studentsDuarations.get(0).get(3).getEnd();
        for(int i = 1 ; i<studentsDuarations.size() ; i++){
            if(latestStartTime < studentsDuarations.get(i).get(3).getStart()){
                latestStartTime = studentsDuarations.get(i).get(3).getStart();
            }
            if(earliestEndTime > studentsDuarations.get(i).get(3).getEnd()){
                earliestEndTime = studentsDuarations.get(i).get(3).getEnd();
            }
        }
        d.setStart(latestStartTime);
        d.setEnd(earliestEndTime);
        avalibleDuration.add(d);
        latestStartTime = studentsDuarations.get(0).get(4).getStart();
        earliestEndTime = studentsDuarations.get(0).get(4).getEnd();
        for(int i = 1 ; i<studentsDuarations.size() ; i++){
            if(latestStartTime < studentsDuarations.get(i).get(4).getStart()){
                latestStartTime = studentsDuarations.get(i).get(4).getStart();
            }
            if(earliestEndTime > studentsDuarations.get(i).get(4).getEnd()){
                earliestEndTime = studentsDuarations.get(i).get(4).getEnd();
            }
        }
        d.setStart(latestStartTime);
        d.setEnd(earliestEndTime);
        avalibleDuration.add(d);
    
        return avalibleDuration;
    }
    public static ArrayList<ModulePart> CreatModules(ArrayList<Duration> avalibleDurations){
        ArrayList<ModulePart> modules = new ArrayList<ModulePart>();
        modules.add(new ModulePart("module 1 lectur" , 1));
        modules.add(new ModulePart("module 1 lab" , 1));
        modules.add(new ModulePart("module 2 lectur" , 2));
        modules.add(new ModulePart("module 2 lab" , 2));
        modules.add(new ModulePart("module 3 lectur" , 3));
        modules.add(new ModulePart("module 3 lab" , 3));
        modules.add(new ModulePart("module 4 lectur" , 4));
        modules.add(new ModulePart("module 4 lab" , 4));
        modules.add(new ModulePart("module 5 lectur" , 5));
        modules.add(new ModulePart("module 5 lab" , 5));
        modules.add(new ModulePart("module 6 lectur" , 6));
        modules.add(new ModulePart("module 6 lab" , 6));
        int modulePartCounter = 0;
        Duration d = new Duration();
        for(int i = avalibleDurations.get(0).getStart() ; i<= avalibleDurations.get(0).getEnd() ; i+=200){
            if((i+200)<=avalibleDurations.get(0).getEnd()){
                d.setStart(i);
                d.setEnd(i+200);
                modules.get(modulePartCounter).setPartDuration(d);
                modulePartCounter++;
            }
            if(modulePartCounter>11)
                break;
        }
        if(modulePartCounter < 12){
            for(int i = avalibleDurations.get(1).getStart() ; i<= avalibleDurations.get(1).getEnd() ; i+=200){
                if((i+200)<=avalibleDurations.get(1).getEnd()){
                    d.setStart(i);
                    d.setEnd(i+200);
                    modules.get(modulePartCounter).setPartDuration(d);
                    modulePartCounter++;
                }
                if(modulePartCounter>11)
                    break;
            }
        }
        if(modulePartCounter < 12){
            for(int i = avalibleDurations.get(2).getStart() ; i<= avalibleDurations.get(2).getEnd() ; i+=200){
                if((i+200)<=avalibleDurations.get(2).getEnd()){
                    d.setStart(i);
                    d.setEnd(i+200);
                    modules.get(modulePartCounter).setPartDuration(d);
                    modulePartCounter++;
                }
                if(modulePartCounter>11)
                    break;
            }
        }
        if(modulePartCounter < 12){
            for(int i = avalibleDurations.get(3).getStart() ; i<= avalibleDurations.get(3).getEnd() ; i+=200){
                if((i+200)<=avalibleDurations.get(3).getEnd()){
                    d.setStart(i);
                    d.setEnd(i+200);
                    modules.get(modulePartCounter).setPartDuration(d);
                    modulePartCounter++;
                }
                if(modulePartCounter>11)
                    break;
            }
        }
        if(modulePartCounter < 12){
            for(int i = avalibleDurations.get(4).getStart() ; i<= avalibleDurations.get(4).getEnd() ; i+=200){
                if((i+200)<=avalibleDurations.get(4).getEnd()){
                    d.setStart(i);
                    d.setEnd(i+200);
                    modules.get(modulePartCounter).setPartDuration(d);
                    modulePartCounter++;
                }
                if(modulePartCounter>11)
                    break;
            }
        }
        return modules;
    }
    
}
