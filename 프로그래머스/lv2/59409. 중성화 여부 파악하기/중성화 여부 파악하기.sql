SELECT ANIMAL_ID, 
        NAME, 
        IF(SUBSTRING_INDEX(SEX_UPON_INTAKE, ' ', 1) in ('Neutered', 'Spayed'), 'O', 'X')
        AS '중성화'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID