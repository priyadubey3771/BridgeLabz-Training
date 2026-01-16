package com.parceltracker;

//represents a delivery stage
class StageNode {

 String stageName;
 StageNode next;

 public StageNode(String stageName) 
 {
     this.stageName = stageName;
     this.next = null;
 }
}
