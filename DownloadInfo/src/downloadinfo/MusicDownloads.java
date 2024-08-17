/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloadinfo;

/**
 *
 * @author steph
 */
import java.util.*;
public class MusicDownloads {
    private List<DownloadInfo> downloadList;
    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();
    }
    public DownloadInfo getDownloadInfo(String title){
        for(int i = 0; i<downloadList.size(); i++){
            if(downloadList.get(i).getTitle().equals(title)){
                return downloadList.get(i);
            }
        }
        return null;
    }
    public void updateDownloads(List<String> titles){
        for(int i = 0; i<titles.size(); i++){
            if(downloadList.indexOf(titles.get(i))<0){
                downloadList.add(new DownloadInfo(titles.get(i)));
            }
        }
    }
}
