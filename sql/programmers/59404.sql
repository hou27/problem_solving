-- 여러 기준으로 정렬하기
-- NAME은 오름차순으로 정렬하고, NAME이 겹치는 경우 DATETIME을 기준으로 내림차순 정렬
SELECT ANIMAL_ID, NAME, DATETIME from ANIMAL_INS order by NAME ASC, DATETIME DESC