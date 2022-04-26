package com.kreitek.interfaces;

import com.kreitek.files.FileSystemItemBase;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    String getFullPath();
    int getSize();
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);

}
