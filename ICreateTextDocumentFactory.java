public class ICreateTextDocumentFactory implements ICreateDocumentFactory {
    @Override
    public IDocument createNewDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpenDocument() {
        return new TextDocument();
    }
}
