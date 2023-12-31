package example.indexing.repo;

import example.indexing.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findAllByEmail(String email);

    Member findByEmail(String email);

    Member findByEmailAndNickname(String email, String nickname);
}
