package com.example.chatmap;
import java.lang.String;

public class Chat {
    String chatName;
    String link;
    String siteName;

    public Chat(String chatName, String link) {
        this.chatName = chatName;
        this.link = link;
        siteName = findSiteName();
    }

    /* Will store the name of the site that the given link is on. (e.g., if this chat link is a discord link, this method
    will return "Discord". This method will be updated later. */
    private String findSiteName(){
        if (link.contains("discord")) {
            return "Discord";
        }
        else if (link.contains("groupme")) {
            return "GroupMe";
        }
        else if (link.contains("slack")) {
            return "Slack";
        }
        else {
            return null;
        }
    }

}
