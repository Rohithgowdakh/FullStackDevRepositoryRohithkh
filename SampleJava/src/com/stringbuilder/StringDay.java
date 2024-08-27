package com.stringbuilder;
class DeleteDayString{
    static StringBuilder deleteEachOccurenceOfDay(String str){
        StringBuilder s1=new StringBuilder(str);
        int index=0;
        while(index<s1.length()-2) {
        	if(s1.substring(index,index+3).equals("DAY")) {
        		s1.delete(index, index+3);
        		s1.insert(index, " ");
        	}
        	else {
        		index++;
        	}
        }
        return s1;
        
    }
}
public class StringDay {
    public static void main(String[] args) {
        StringBuilder res=DeleteDayString.deleteEachOccurenceOfDay("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        System.out.println(res);
    }
}
