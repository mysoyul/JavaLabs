package lab.librarymgt.entity;
// 인터페이스: 대출 가능한 자료
public interface Borrowable {
    int getLoanPeriod(); // 대출 기간(일)
    double calculateFine(int daysLate); // 연체료 계산
}