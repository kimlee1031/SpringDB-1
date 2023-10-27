package hello.jdbc.Repository;

import hello.jdbc.domain.Member;

public interface MemberRepository {
    Member save(Member member);

    Member findById(String string);

    void update(String memberId, int money);

    void delete(String memberId);

}
