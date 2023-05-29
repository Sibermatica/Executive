package org.sibermatica.network.mail;

import org.sibermatica.network.mail.client.MailSender;

import java.util.Objects;

public class Email {

    private final String from;
    private final String to;
    private final String subject;
    private final StringBuilder body;

    public Email(String from, String to, String subject, StringBuilder body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public StringBuilder getBody() {
        return body;
    }

    public static Builder of() {
        return new Builder();
    }

    private static class Builder {
        private String from = null;
        private String to = null;
        private String subject = null;
        private StringBuilder body = null;

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(StringBuilder body) {
            this.body = body;
            return this;
        }

        public Builder body(String body) {
            this.body = new StringBuilder(body);
            return this;
        }

        public Builder body(byte[] baBody) {
            this.body = new StringBuilder(new String(baBody));
            return this;
        }

        public Builder body(char[] caBody) {
            this.body = new StringBuilder(new String(caBody));
            return this;
        }

        public Email build() {
            if (Objects.isNull(from) || Objects.isNull(to) || Objects.isNull(subject) || Objects.isNull(body)) {
                throw new IllegalArgumentException("Email must have from, to, subject and body");
            }
            return new Email(from, to, subject, body);
        }
    }

    public void send(String server, int port, String password) {
        Object[] user_data = new Object[] {
                this.from, password
        };

        Object[] server_data = new Object[] {
                server, port
        };

        MailSender.send(this, user_data, server_data);

    }

}
