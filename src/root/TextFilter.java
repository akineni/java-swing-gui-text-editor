/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Oseghale Ruth
 */
public class TextFilter extends FileFilter{

    @Override
    public boolean accept(File f) {
        if(f.isDirectory()) {
            return true;
        }
        
        String fileExt = getFileExtension(f);
        
        if(fileExt.equals("txt")){
            return true;
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Text Files";
    }
    
    private String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
    
    public String getFileExtension(File file) {
        return getFileExtension(file.getName());
    }
    
    
    
}
