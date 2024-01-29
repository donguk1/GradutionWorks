package kopo.poly.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class BoardDTO{
    private Long boardSeq;          // 기본키; 순번
    private String title;           // 제목
    private String noticeYn;        // 공지여부
    private String contents;        // 글 내용
    private String regId;           // 작성자
    private Long readCnt;           // 조회수
    private String regDt;           // 등록일
    private String chgDt;           // 수정일
    private String userName;




}
