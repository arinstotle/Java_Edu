public class ICreateMusicDocumentFactory implements ICreateDocumentFactory {
    @Override
    public IDocument createNewDocument() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpenDocument() {
        return new MusicDocument();
    }
}
