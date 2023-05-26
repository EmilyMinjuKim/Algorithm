from collections import Counter
def solution(clothes):
    answer = 1
    map = dict(Counter([type for name, type in clothes]))
    map_list = list(map.values())
    
    for i in map_list:
        answer *= (i+1)
    
    return answer-1