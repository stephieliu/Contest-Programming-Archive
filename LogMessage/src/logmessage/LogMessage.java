/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logmessage;

/**
 *
 * @author steph
 */
import java.util.*;
public class LogMessage {

    /**
     * @param args the command line arguments
     */
    private String machineId;
    private String description;
    private List<LogMessage> messageList; 
    
    public LogMessage(String message){
        int index = message.indexOf(":");
        machineId = message.substring(0, index);
        description = message.substring(index+1);
    }
    
    public boolean containsWord(String keyword){
        return (" "+ description+" ").indexOf(" "+keyword+" ")>=0;
    }
    
    public List<LogMessage> removeMessage(String keyword){
        List<LogMessage> myList = new ArrayList<LogMessage>();
        for(int i = 0; i<messageList.size(); i++){
            if(messageList.get(i).containsWord(keyword)){
                myList.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return myList;
    }
}
