def solution(s):
    answer = 0
    
    '''for i in range(1, len(s)):
        new_s = s[:i+1]
        new_s = new_s[::-1]
        if s[:i+1] == new_s:
            answer = max(len(new_s), answer)'''
            
    new_s = s[::-1]
    
    for i in range(len(s)):
        for j in range(len(s), i, -1):
            new_s = s[i:j]
            if new_s == new_s[::-1]:
                answer = max(answer, len(new_s))

    return answer