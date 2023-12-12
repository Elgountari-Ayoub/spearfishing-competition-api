package ma.youcode.pm.service;

import ma.youcode.pm.dto.MemberRequest;
import ma.youcode.pm.dto.MemberResponse;
import ma.youcode.pm.model.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IMemberService {
    Optional<MemberResponse> finByNum(String num);
    Page<MemberResponse> finAll(Pageable pageable);
    ResponseEntity save(MemberRequest memberRequest);
    ResponseEntity update(MemberRequest memberRequest);
    ResponseEntity delete(String num);

}
