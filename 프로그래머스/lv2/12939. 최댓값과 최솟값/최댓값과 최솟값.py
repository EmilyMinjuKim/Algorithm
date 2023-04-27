def solution(s):
    num = list(map(int, s.split()))
    
    min_ = min(num)
    max_ = max(num)
    answer = f'{min_} {max_}'
    
    
    return answer