/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necklace;

/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;
import java.util.*;
public class Necklace {

    /**
     * @param args the command line arguments
     */
    private String filename = "";
    private Map<String,ArrayList<String>> Graph = new HashMap<String, ArrayList<String>>();
    // I used my own version of DFS to solve this problem
    //The idea:
    //use DFS to trasverse each node in depth
    //set an arraylist at the same time 
    //It will store the points that have been traversed
    //if a loop is formed, print the point
    //It could have been possible to solve this with the Cycle method
    //that was given last last class
    //but I was too lazy to find the file so I wrote DFS instead
    
    
    ArrayList POINTS = new ArrayList();

    public void initGraph() throws IOException {

        File file = new File(filename);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            String[] temp = line.split(",");
            if (!POINTS.contains(temp[0])){
                POINTS.add(temp[0]);
            }
            if (!POINTS.contains(temp[1])){
                POINTS.add(temp[1]);
            }
            if (this.Graph.containsKey(temp[0])){
                ArrayList<String> A = Graph.get(temp[0]);
                A.add(temp[1]);
                this.Graph.put(temp[0],A);
            }
            else {
                ArrayList<String> newList = new ArrayList<String>();
                newList.add(temp[1]);
                this.Graph.put(temp[0],newList);
            }
        }
        bufferedReader.close();
    }


    private HashMap<String,Boolean> NodeState = new HashMap<String, Boolean>();



    private ArrayList<String> nodeList = new ArrayList<String>();


    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

    public void SearchingStart(String firstNode){
        nodeList.add(firstNode);
        NodeState.put(firstNode,true);
        List<String> tempList = Graph.get(firstNode);
        if (tempList == null){
            return;
        }
        for (String x : tempList){
            if (nodeList.contains(x)){
                List<String> loopList = nodeList.subList(nodeList.indexOf(x),nodeList.size());
                ArrayList<String> toBeAddedInToReault = new ArrayList<String>();
                for (String points:loopList){
                    toBeAddedInToReault.add(points);
                    continue;
                }

                if (!HasHave(result,toBeAddedInToReault)) {
                    result.add(toBeAddedInToReault);
                }

            }

            else {

                if (Graph.get(x) == null) {
                    NodeState.put(x,true);
                    continue;
                }



                boolean allVisited = true;
                for (String neighborPoints : Graph.get(x)){
                    if (!NodeState.containsKey(neighborPoints)){
                        allVisited = false;
                        break;
                    }
                    if (NodeState.get(neighborPoints) == true){
                        continue;
                    }
                    else {
                        allVisited = false;
                        break;
                    }
                }
                boolean b1 = false;
                for (String neighborPoints : Graph.get(x)) {
                    if (nodeList.contains(neighborPoints)) {
                        b1 = true;
                    }
                }
                if (allVisited && b1){
                    allVisited = false;
                }
                if (allVisited){
                    continue;
                }


                else {
                    SearchingStart(x);
                }

            }

        }
        nodeList.remove(nodeList.size() - 1);
    }


    public static void main(String[] args) {
        Necklace a = new Necklace();
        try {
            a.initGraph();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> nodes = a.POINTS;
        for (int i = 0 ; i < nodes.size() ; i ++){
            String temp = nodes.get(i);
            a.SearchingStart(temp);
            a.nodeList.clear();
            a.NodeState.clear();
        }

        ArrayList R = a.result;
        if (R.isEmpty()){
            System.out.println(0);
        }
        else {
            System.out.println(1);
            System.out.println(R.size());
            for (int i = 0 ; i <= R.size() - 1 ; i ++){
                ArrayList A = (ArrayList) R.get(i);
                for (int j = 1 ; j <= A.size() - 1 ; j ++){
                    System.out.print(A.get(j - 1)+" ");
                }
                System.out.println(A.get(A.size() - 1));
            }

        }
    }


    public boolean HasHave(ArrayList<ArrayList<String>> A , ArrayList<String> a){
        for (int i = 0 ; i < A.size() ; i ++){
            if (A.get(i).size() == a.size()){
                int j = 0;
                while (j < A.get(i).size()){
                    String k = A.get(i).get(j);
                    j++;
                    if (!a.contains(k)){
                        return false;
                    }
                    else continue;
                }
                return true;
            }
        }
        return false;
    }
}
