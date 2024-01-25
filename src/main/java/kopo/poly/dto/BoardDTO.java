package kopo.poly.dto;

import lombok.Builder;

@Builder
public record BoardDTO(

        Long boardSeq, // 기본키, 순번
        String title, // 제목
        String contents, // 글 내용
        String regId, // 작성자
        Long readCnt, // 조회수
        String regDt, // 등록일
        String chgDt  // 수정일
) {

}
