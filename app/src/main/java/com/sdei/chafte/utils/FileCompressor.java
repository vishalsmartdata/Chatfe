package com.sdei.chafte.utils;

import android.content.Context;
import android.graphics.Bitmap;

import java.io.File;
import java.io.IOException;

public class FileCompressor {
    //max width and height values of the compressed image is taken as 612x816
    private int maxWidth = 412;
    private int maxHeight = 616;
    private Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
    private int quality = 50;
    private String destinationDirectoryPath;
    public FileCompressor(Context context) {
        destinationDirectoryPath = context.getCacheDir().getPath() + File.separator + "images";
    }
    public com.sdei.chafte.utils.FileCompressor setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }
    public com.sdei.chafte.utils.FileCompressor setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }
    public com.sdei.chafte.utils.FileCompressor setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.compressFormat = compressFormat;
        return this;
    }
    public com.sdei.chafte.utils.FileCompressor setQuality(int quality) {
        this.quality = quality;
        return this;
    }
    public com.sdei.chafte.utils.FileCompressor setDestinationDirectoryPath(String destinationDirectoryPath) {
        this.destinationDirectoryPath = destinationDirectoryPath;
        return this;
    }
    public File compressToFile(File imageFile) throws IOException {
        return compressToFile(imageFile, imageFile.getName());
    }
    public File compressToFile(File imageFile, String compressedFileName) throws IOException {
        return ImageUtil.compressImage(imageFile, maxWidth, maxHeight, compressFormat, quality,
                destinationDirectoryPath + File.separator + compressedFileName);
    }
    public Bitmap compressToBitmap(File imageFile) throws IOException {
        return ImageUtil.decodeSampledBitmapFromFile(imageFile, maxWidth, maxHeight);
    }

}
