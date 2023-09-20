class SendGridEmailAdapter implements EmailService {
    private SendGrid sendGrid;

    public SendGridEmailAdapter(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
        Email from = new Email("noreply@eurobank.com");
        Email to = new Email(destinatario);
        Content content = new Content("text/plain", cuerpo);
        Mail mail = new Mail(from, asunto, to, content);

        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGrid.api(request);
            
        } catch (IOException ex) {
            
        }
    }
}
