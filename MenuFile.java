public class MenuFile {
    private ICreateDocumentFactory iCreateDocumentFactory;
    IDocument iDocument;
    public IDocument New(String type)
    {
        System.out.println("Create process...");

        switch (type)
        {
            case "ImageApplication":
                iCreateDocumentFactory = new ICreateImageDocumentFactory();
                 iDocument = iCreateDocumentFactory.createNewDocument();
                 break;

            case "TextApplication":
                iCreateDocumentFactory = new ICreateTextDocumentFactory();
                 iDocument = iCreateDocumentFactory.createNewDocument();
                 break;

            case "MusicApplication":
                iCreateDocumentFactory = new ICreateMusicDocumentFactory();
                iDocument = iCreateDocumentFactory.createNewDocument();
                break;
        }

            return iDocument;
    }

    public IDocument Open(String type)
    {
        System.out.println("Open process...");

        switch (type)
        {
            case "ImageApplication":
                iCreateDocumentFactory = new ICreateImageDocumentFactory();
                iDocument = iCreateDocumentFactory.createOpenDocument();
                break;

            case "TextApplication":
                iCreateDocumentFactory = new ICreateTextDocumentFactory();
                iDocument = iCreateDocumentFactory.createOpenDocument();
                break;

            case "MusicApplication":
                iCreateDocumentFactory = new ICreateMusicDocumentFactory();
                iDocument = iCreateDocumentFactory.createOpenDocument();
                break;
        }

        return iDocument;
    }

    public void Save()
    {

    }

    public void Exit()
    {

    }
}
