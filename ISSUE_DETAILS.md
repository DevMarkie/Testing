# Chi tiet 2 issue kiem thu JUnit

## Issue 1: Statement Coverage

### Muc tieu

Viet cac test JUnit de dam bao tat ca cac cau lenh trong `GradeAnalyzer.evaluateSemester(int[] scores)` duoc thuc thi it nhat 1 lan.

### Pham vi

- Kiem thu ham: `GradeAnalyzer.evaluateSemester`.
- Khong thay doi logic nghiep vu.
- Chi bo sung test de dat statement coverage.

### Cac cau lenh/nhanh can cham

1. Tra ve `INVALID` khi `scores == null`.
2. Tra ve `INVALID` khi `scores.length == 0`.
3. Vong lap `for` duyet diem va cong tong.
4. Nhanh `if (score < 5)` de tang `failedSubjects`.
5. Tra ve `RETAKE` khi `failedSubjects > 0`.
6. Tra ve `HONOR` khi `average >= 8.0` va khong co mon truot.
7. Tra ve `PASS` khi `average >= 6.5` va `< 8.0` va khong co mon truot.
8. Tra ve `CONDITIONAL` khi `average < 6.5` va khong co mon truot.

### Tap test toi thieu

- `null` -> `INVALID`
- `[]` -> `INVALID`
- `[9,4,8]` -> `RETAKE`
- `[8,8,8,8]` -> `HONOR`
- `[7,7,6,6]` -> `PASS`
- `[5,6,5,6]` -> `CONDITIONAL`

### Acceptance Criteria

- `mvn test` pass.
- Moi statement trong `evaluateSemester` duoc thuc thi it nhat 1 lan.
- Co commit rieng cho issue nay.

## Issue 2: Feasible Path Coverage

### Muc tieu

Viet cac test JUnit de bao phu tat ca cac duong di kha thi trong `GradeAnalyzer.evaluateSemester`.

### Pham vi

- Kiem thu duong di theo cac quyet dinh trong ham.
- Uu tien cac bien gia tri `6.5` va `8.0`.
- Chi xet duong di kha thi.

### Danh sach duong di kha thi

1. Input `null` -> `INVALID`.
2. Input rong -> `INVALID`.
3. Input hop le + co diem `< 5` -> `RETAKE`.
4. Input hop le + khong truot + `average >= 8.0` -> `HONOR`.
5. Input hop le + khong truot + `6.5 <= average < 8.0` -> `PASS`.
6. Input hop le + khong truot + `average < 6.5` -> `CONDITIONAL`.

### Tap test toi thieu

- `null` -> `INVALID`
- `[]` -> `INVALID`
- `[10,9,4,8]` -> `RETAKE`
- `[8,8,8,8]` -> `HONOR` (bien `8.0`)
- `[6,7,6,7]` -> `PASS` (bien `6.5`)
- `[5,6,6,5]` -> `CONDITIONAL`

### Acceptance Criteria

- Bao phu du cac duong di kha thi neu tren.
- Co test bien gia tri `6.5` va `8.0`.
- `mvn test` pass.
- Co commit rieng cho issue nay.
