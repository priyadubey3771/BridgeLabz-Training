package com.functionalinterfaces.dataserializationforbackup;
public class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupEligible) 
        {
            System.out.println("Backing up data: " + obj.getClass().getSimpleName());
        } 
        else 
        {
            System.out.println("This object is NOT eligible for backup.");
        }
    }
}
