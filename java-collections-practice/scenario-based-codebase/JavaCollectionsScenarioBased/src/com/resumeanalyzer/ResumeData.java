package com.resumeanalyzer;

import java.util.List;

public class ResumeData {

    private String email;
    private String phone;
    private List<String> keywords;
    private int matchCount;

    public ResumeData(String email, String phone, List<String> keywords) 
    {
        this.email = email;
        this.phone = phone;
        this.keywords = keywords;
        this.matchCount = keywords.size();
    }

    public int getMatchCount() 
    {
        return matchCount;
    }

    @Override
    public String toString() 
    {
        return "Email: " + email +", Phone: " + phone +", Keywords: " + keywords +", Matches: " + matchCount;
    }
}
