-- ANIMAL_TYPE을 그룹화하여 그것의 개수를 셈
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE)
FROM ANIMAL_INS
group by ANIMAL_TYPE -- TYPE을 그룹화하여 그것의 개수를 셈
order by ANIMAL_TYPE -- TYPE을 기준으로 오름차순 정렬