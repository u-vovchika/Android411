package com.example.filemanagerprojectaplication;

import java.io.File;

public interface OnFileSelectedListener {
    void onFileClicked(File file);  /// короткий клик
    void onFileLongClicked(File file, int position); /// длинный клик
}
