package service;

import domain.PageBean;
import domain.Paper;

import java.util.List;

public interface PaperService {
    PageBean<Paper> findPaperByPage(String currentPage, String rows);
    boolean checkPaperMajor(String major);
    int addPaper(Paper paper);

    List<Paper> findMyPapers(Object email);

    void deletePaper(String id);
}
