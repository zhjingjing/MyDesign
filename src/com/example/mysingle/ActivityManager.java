package com.example.mysingle;

import java.util.Stack;

import android.app.Activity;

public class ActivityManager {
   private static ActivityManager activityManager=null;
   private Stack<Activity> stack=new Stack<>();
   
   private ActivityManager(){
   }
   
   public static ActivityManager getInstance(){
     if(activityManager==null){
       
       synchronized (ActivityManager.class) {
         if (activityManager==null) {
          activityManager=new ActivityManager();
        }
      }
     }  
     return activityManager;
   }
   
   public void addview(Activity activity){
     stack.add(activity);
   }
   public void removeview(Activity activity){
     stack.remove(activity);
   }
   
   public void killprocess(){
      int count=stack.size();
      for (int i = 0; i < count; i++) {
           Activity activity=stack.get(i);
           activity.finish();
      }
     stack.clear();
     android.os.Process.killProcess(android.os.Process.myPid());
   }
}
