public class IPat {
    //private native void print();
    //private native void printFile();
    //private String paths[] = {"C:/ipat1.xml", "C:/ipat2.xml"};
    //private FilesGui gui;
    private native void printXML(String paths[]);
    private IPat() {
        FilesGui filesGui = new FilesGui(this);
    }

    public void submitToDLL(String[] filePaths) {
        printXML(filePaths);
    }

    public static void main(String[] args) {
        new IPat();
    }

    static {
        System.loadLibrary("IPatC");
    }
}
