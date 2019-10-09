/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_studentlist;

import java.util.List;

/**
 *
 * @author edarsow
 */
public class FileController {
    private FileModel model;
    private FileView view;
    private FileController cont;
    final static String FILE_NAME = "names.txt";
    
    public static void main(String[] args) {
        setupMVC();
    }
    
    public static void setupMVC(){
        FileController fc = new FileController();
        fc.createModel();
        fc.createView();
    }
    
    public void createModel(){
        model = new FileModel();
        model.writeFile(FILE_NAME);
        model.readFile(FILE_NAME);
    }
    
    public void createView(){
        view = new FileView();
        view.setController(this);
        view.initializeWindow();
    }
    
    public List<Student> retrieveFileContents(String filename){
        List<Student> studList = model.readFile(filename);
        System.out.println("Retrieving student list");
        return studList;
        
    }

    /**
     * @return the model
     */
    public FileModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(FileModel model) {
        this.model = model;
    }

    /**
     * @return the view
     */
    public FileView getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(FileView view) {
        this.view = view;
    }
    
}
