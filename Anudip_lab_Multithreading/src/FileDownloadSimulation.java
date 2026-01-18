class FileDownload extends Thread {
    private String fileName;
    FileDownload(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        try {
            for (int i = 10; i <= 100; i += 10) {
                System.out.println("Downloading " + fileName + " - " + i + "%");
                Thread.sleep(1000); // 1 second delay
            }
            System.out.println(fileName + " download completed.");
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }
    }
}
public class FileDownloadSimulation {
    public static void main(String[] args) {
        FileDownload d1 = new FileDownload("File1.mp4");
        FileDownload d2 = new FileDownload("File2.pdf");

        d1.start();
        d2.start();
    }
}
