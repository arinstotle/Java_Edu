public class ICreateImageDocumentFactory implements ICreateDocumentFactory{
    @Override
    public IDocument createNewDocument() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpenDocument() {
        return new ImageDocument();
    }
}
