public class MainApp {
    public static void main(String[] args) {
        ImageApp imageApp = new ImageApp();
        TextApp textApp = new TextApp();
        MusicApp musicApp = new MusicApp();
        IDocument iDocumentN = imageApp.ClickFileNew();
        iDocumentN.info();
        IDocument iDocumentO = imageApp.ClickFileOpen();
        iDocumentO.info();
    }
}
