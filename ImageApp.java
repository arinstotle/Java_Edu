public class ImageApp extends App {
    private Applications type = Applications.IMAGE;

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
