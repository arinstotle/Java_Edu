public class TextApp extends App {
    private Applications type = Applications.TEXT;
    private MenuFile appFile = new MenuFile();

    public IDocument ClickFileOpen()
    {
        return appFile.Open(type.typoOf);
    }

    public IDocument ClickFileNew()
    {
        return appFile.New(type.typoOf);
    }

    public void ClickFileSave()
    {
        appFile.Save();
    }

    public void ClickFileExit()
    {
        appFile.Exit();
    }
}
