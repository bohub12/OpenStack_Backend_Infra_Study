package jaemin.imgboard.repository;

import jaemin.imgboard.domain.ImageFile;
import jaemin.imgboard.dto.ImageDto;

import java.util.List;

public interface ImageRepository {
    void save(ImageDto file);
    void delete(Long fileId);
    List<ImageFile> getFileList();
}