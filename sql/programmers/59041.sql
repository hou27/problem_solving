-- 동명 동물 수 찾기
-- NAME을 그룹화하며, COUNT(NAME)를 세고,
-- 그 수가 2 이상인 것만을 NAME을 기준으로 정렬한다.
SELECT NAME, COUNT(NAME)
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME) >= 2
ORDER BY NAME