package spring.java.domain;

import java.util.Date;

/**
 * Created by Vlad on 11/16/2016.
 */
public class BlockPost {
    private long id;
    private String title;
    private String content;
    private Date publichDate;
    private boolean draft;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublichDate() {
        return publichDate;
    }

    public void setPublichDate(Date publichDate) {
        this.publichDate = publichDate;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }
}
