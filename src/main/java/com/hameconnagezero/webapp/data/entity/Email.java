package com.hameconnagezero.webapp.data.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;


@Entity
public class Email extends AbstractEntity {
    private LocalDate dateReceived;
    @jakarta.validation.constraints.Email
    private String emailFrom;
    @jakarta.validation.constraints.Email
    private String emailReplyTo;
    @jakarta.validation.constraints.Email
    private String emailTo;
    private String Subject;
    private String Text;
    private boolean hasAttachment;
    private boolean wasInvestigated;


    public LocalDate getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(LocalDate dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailReplyTo() {
        return emailReplyTo;
    }

    public void setEmailReplyTo(String emailReplyTo) {
        this.emailReplyTo = emailReplyTo;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public boolean hasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public boolean wasInvestigated() {
        return wasInvestigated;
    }

    public void setWasInvestigated(boolean wasInvestigated) {
        this.wasInvestigated = wasInvestigated;
    }
}
