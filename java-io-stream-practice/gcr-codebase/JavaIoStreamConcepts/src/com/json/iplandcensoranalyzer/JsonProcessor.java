package com.json.iplandcensoranalyzer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class JsonProcessor {

    public static void processJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<Match> matches = mapper.readValue(
                new File("ipl.json"),
                new TypeReference<List<Match>>() {}
        );

        for (Match m : matches) {
            m.setTeam1(CensorUtil.maskTeamName(m.getTeam1()));
            m.setTeam2(CensorUtil.maskTeamName(m.getTeam2()));
            m.setWinner(CensorUtil.maskTeamName(m.getWinner()));
            m.setPlayer_of_match(CensorUtil.redactPlayer());
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("ipl_censored.json"), matches);
    }
}
