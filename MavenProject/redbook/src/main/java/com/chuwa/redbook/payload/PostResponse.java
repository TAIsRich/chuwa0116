package com.chuwa.redbook.payload;

import com.chuwa.redbook.entity.Post;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/6/23
 */
@JsonPropertyOrder({ "last", "pageNo", "pageSize", "totalElements", "totalPages", "content" })
public class PostResponse {

    private List<PostDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;

    @JsonProperty("isLast")
    private boolean last;

    public PostResponse() {}

    public PostResponse(List<PostDto> postDtos, Page<Post> postPages) {
        this.content = postDtos;
        this.pageNo = postPages.getNumber();
        this.pageSize = postPages.getSize();
        this.totalElements = postPages.getTotalElements();
        this.totalPages = postPages.getTotalPages();
        this.last = postPages.isLast();
    }

    public PostResponse(List<PostDto> content, int pageNo, int pageSize, long totalElements, int totalPages, boolean last) {
        this.content = content;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.last = last;
    }

    public List<PostDto> getContent() {
        return content;
    }

    public void setContent(List<PostDto> content) {
        this.content = content;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "PostResponse{" +
            "content=" + content +
            ", pageNo=" + pageNo +
            ", pageSize=" + pageSize +
            ", totalElements=" + totalElements +
            ", totalPages=" + totalPages +
            ", last=" + last +
            '}';
    }
}
