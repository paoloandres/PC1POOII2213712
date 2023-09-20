public class EuroBankReportGenerator {
    private EmailService emailService;

    public EuroBankReportGenerator(EmailService emailService) {
        this.emailService = emailService;
    }

    public void generarReporte(String destinatario, String asunto, String cuerpo) {
       

        
        emailService.enviarCorreo(destinatario, asunto, cuerpo);
    }
}
