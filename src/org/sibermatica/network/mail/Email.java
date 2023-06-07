package org.sibermatica.network.mail;

import org.sibermatica.network.mail.client.MailSender;
import org.sibermatica.network.mail.server.MailServer;

import java.util.Objects;

/**
 * <h1>Email</h1>
 * This class allows you to send emails.  Getting email-data and more.
 *
 * @param from    Email what come from.
 * @param to      Email address to send email-data.
 * @param subject Email subject.
 * @param body    Email body.
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @apiNote This class is not functional, this class is a representation. You should use true smtp servers.
 * @see MailSender
 * @see MailServer
 * @since 1.3
 */
public record Email(String from, String to, String subject, StringBuilder body) {

    /* -- Variables -- */

    /**
     * Instances a new Email class
     */

    /* -- Constructors -- */
    public Email {
    }

    /* -- Getters -- */

    /**
     * Returns the email address what come from.
     *
     * @return the email address what come from.
     */
    @Override
    public String from() {
        return from;
    }

    /**
     * Returns the email address to send email-data.
     *
     * @return the email address to send email-data.
     */

    @Override
    public String to() {
        return to;
    }

    /**
     * Returns the email subject.
     *
     * @return the email subject.
     */

    @Override
    public String subject() {
        return subject;
    }

    /**
     * Returns the email body.
     *
     * @return the email body.
     */

    @Override
    public StringBuilder body() {
        return body;
    }

    /* Builders */

    /**
     * Creates a new EmailBuilder.
     */
    public static Builder of() {
        return new Builder();
    }

    /**
     * <h1>EmailBuilder</h1>
     * This class allows you to create a new Email without having to put
     * manually all arguments and short code line.
     *
     * @see org.sibermatica.network.mail
     */
    private static class Builder {

        /* Variables */

        /**
         * Email what come from.
         */
        private String from = null;

        /**
         * Email address to send email-data.
         */
        private String to = null;

        /**
         * Email subject.
         */
        private String subject = null;

        /**
         * Email body.
         */
        private StringBuilder body = null;

        /* Setters */

        /**
         * Sets the email that come from.
         *
         * @param from the email that come from.
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the email address to send email-data.
         *
         * @param to the email address to send email-data.
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets the email subject.
         *
         * @param subject the email subject.
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Sets the email body.
         *
         * @param body the email body.
         */
        public Builder body(StringBuilder body) {
            this.body = body;
            return this;
        }

        /**
         * Sets the email body.
         *
         * @param body the email body.
         */
        public Builder body(String body) {
            this.body = new StringBuilder(body);
            return this;
        }

        /**
         * Sets the email body.
         *
         * @param baBody the email body.
         */
        public Builder body(byte[] baBody) {
            this.body = new StringBuilder(new String(baBody));
            return this;
        }

        /**
         * Sets the email body.
         *
         * @param caBody the email body.
         */
        public Builder body(char[] caBody) {
            this.body = new StringBuilder(new String(caBody));
            return this;
        }

        /**
         * Builds the Email class.
         */
        public Email build() {
            if (Objects.isNull(from) || Objects.isNull(to) || Objects.isNull(subject) || Objects.isNull(body)) {
                throw new IllegalArgumentException("Email must have from, to, subject and body");
            }
            return new Email(from, to, subject, body);
        }
    }

    /* Methods */

    /**
     * Sends the email to an SMTP email Server.
     *
     * @param server   the SMTP email server.
     * @param password our email address password.
     * @return true if the email was sent successfully.
     */
    public boolean send(MailServer server, String password) {
        try {
            MailSender.send(this, server);
        } catch (UnsupportedOperationException e) {
            return false;
        }

        return true;
    }

}
