package org.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Files
        File file1 = new File("Document1.txt", 120);
        File file2 = new File("Image1.png", 200);
        File file3 = new File("Presentation.pptx", 300);

        // Folders
        Folder folder1 = new Folder("Work");
        Folder folder2 = new Folder("Personal");
        Folder rootFolder = new Folder("Root");

        // Build folder structure
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Display structure and sizes
        rootFolder.display("");
        System.out.println("Total Size: " + rootFolder.getSize() + " KB");
    }
}



